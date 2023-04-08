package com.poly.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

	@ManyToOne
	@JoinColumn(name="masp")
	private SanPhamEntity SanPham;
	
	@Column(name="soluong")
	private int soluong;
	
	@ManyToOne
	@JoinColumn(name="mamau") 
	private MauEntity Mau;
	
	@ManyToOne
	@JoinColumn(name="manguoidung")
	private UserEntity Users;

}
