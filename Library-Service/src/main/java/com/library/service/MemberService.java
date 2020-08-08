package com.library.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entiry.Member;
import com.library.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	MemberRepository repository;

	public Member register(Member member) {
		return repository.save(member);
	}

	public Member getMemberDetails(UUID id) {
		return repository.findById(id).get();
	}
}
