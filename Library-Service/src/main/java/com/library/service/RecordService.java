package com.library.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entiry.Record;
import com.library.repository.BookRepository;
import com.library.repository.MemberRepository;
import com.library.repository.RecordRepository;
import com.libraryexceptions.RecordExcepton;
@Service
public class RecordService {

	@Autowired
	RecordRepository recordRepository;
	@Autowired
	MemberRepository memberRepository;

	@Autowired
	BookRepository bookRepository;

	public String asignBook(UUID memberID, UUID bookId) {
		Record record = null;
		String message = null;
		try {
			if (memberRepository.findById(memberID).get() != null && bookRepository.findById(bookId).get() != null) {
				record = new Record();
				record.setMemberId(memberID);
				record.setBookId(bookId);
				record.setTakenDate(new Date());
				recordRepository.save(record);
				message = "Success";
			} else
				throw new RecordExcepton("Member or book not found", 1);
		} catch (Exception e) {
			message = "Error";
		}
		return message;
	}

	public String returnBook() {
		return null;
	}
}
