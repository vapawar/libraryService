package com.library.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.Constants;
import com.library.entiry.Member;
import com.library.service.MemberService;

@RestController
@RequestMapping(Constants.BASE_URL)
public class MemberController {
	@Autowired
	MemberService memberService;

	@PostMapping(value = Constants.REG_MEMBER_URL, consumes = "application/json")
	public Member Register(@RequestBody Member member) {
		Member response = null;
		try {
			response = memberService.register(member);
		} catch (Exception e) {
		}
		return response;
	}

	@GetMapping(value = Constants.GET_MEMBER_URL)
	public Member getMemberDetails(@PathVariable("memberId") UUID memberId) {
		Member response = null;
		try {
			response = memberService.getMemberDetails(memberId);
		} catch (Exception e) {
		}
		return response;
	}
}
