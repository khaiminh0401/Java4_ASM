package com.poly.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ThuongHieu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThuongHieuEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
}
