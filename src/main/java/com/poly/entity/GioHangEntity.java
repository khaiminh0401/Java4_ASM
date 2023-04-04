package com.poly.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="GioHang")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GioHangEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="soluong")
	private int soluong;
	
	private int masp;
	private int mamau;
	private int MaNguoiDung;
}
