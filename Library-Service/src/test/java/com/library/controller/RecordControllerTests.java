package com.library.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.library.Constants;
import com.library.service.RecordService;

@SpringBootTest
@AutoConfigureMockMvc
public class RecordControllerTests {

	@Autowired
	private MockMvc mvc;
	@MockBean
	private RecordService recordService;

	@Test
	public void test01_AssignBook() throws Exception {
		UUID id1 = new UUID(8, 8);
		UUID id2 = new UUID(8, 8);
		Mockito.when(recordService.asignBook(id1, id2)).thenReturn("Success");
		String message = null;
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post(Constants.BASE_URL)
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mvc.perform(requestBuilder).andReturn();
		message = result.getResponse().getContentAsString();
		assertTrue(message.equalsIgnoreCase("Success"));
	}

	@Test
	public void test02_AssignBook() throws Exception {
		UUID id1 = new UUID(8, 8);
		UUID id2 = new UUID(8, 8);
		Mockito.when(recordService.asignBook(id1, id2)).thenReturn("Error");
		String message = null;
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post(Constants.BASE_URL)
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mvc.perform(requestBuilder).andReturn();
		message = result.getResponse().getContentAsString();
		assertTrue(message.equalsIgnoreCase("Error"));
	}
}
