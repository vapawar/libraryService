package com.library.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entiry.Rack;

public interface RackRepository extends JpaRepository<Rack, UUID>{

}
