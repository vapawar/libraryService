package com.library.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.entiry.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {

}
