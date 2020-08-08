package com.library.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.Constants;
import com.library.service.RecordService;

@RestController
@RequestMapping(Constants.BASE_URL)
public class RecordController {

	@Autowired
	RecordService recordService;

	@PostMapping
	public ResponseEntity<String> lendBook(@RequestParam("memberId") UUID memberId,
			@RequestParam("bookId") UUID bookId) {
		ResponseEntity<String> response = null;
		String message = null;
		try {
			if (memberId != null && bookId != null)
				message = recordService.asignBook(memberId, bookId);
			else
				throw new Exception("member or book id is empty");
			if (message != null)
				response = new ResponseEntity<String>("Book assigned succesfully", HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<String>("Book assigned succesfully", HttpStatus.OK);
		}
		return response;
	}

	@PatchMapping(Constants.ASSIGN_BOOK_URL)
	public String returnBook(@RequestParam("memberId") UUID memberId, @RequestParam("memberId") UUID bookId) {
		return recordService.returnBook();
	}
}
