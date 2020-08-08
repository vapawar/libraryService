package com.library.entiry;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Book {

	@Id
	@Type(type = "uuid-char")
	@Column(name = "id", columnDefinition = "varchar(40)", insertable = false, nullable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "isbn")
	private String ISBN;
	@Column(name = "title")
	private String title;
	@Column(name = "subject")
	private String subject;
	@Column(name = "publisher")
	private String publisher;
	@Column(name = "author")
	private String author;
}