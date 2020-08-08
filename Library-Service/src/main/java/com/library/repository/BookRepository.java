package com.library.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entiry.Book;

public interface BookRepository extends JpaRepository<Book, UUID> {

}
