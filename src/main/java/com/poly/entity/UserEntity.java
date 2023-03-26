package com.poly.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="password")
	private String password;
	@Column(name="fullname")
	private String fullname;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	@Column(name="isAdmin")
	private boolean isAdmin;
}
