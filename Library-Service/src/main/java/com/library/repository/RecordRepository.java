package com.library.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entiry.Record;

public interface RecordRepository extends JpaRepository<Record, UUID> {

}
