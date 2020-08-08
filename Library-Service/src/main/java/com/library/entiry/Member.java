package com.library.entiry;

import java.io.Serializable;
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
public class Member implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Type(type = "uuid-char")
	@Column(name = "id", columnDefinition = "varchar(40)", insertable = false, nullable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
}
