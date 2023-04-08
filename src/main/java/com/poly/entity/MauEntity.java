package com.poly.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Mau")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MauEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
//	@ManyToOne
//	@JoinColumn(name = "masp")
//	private List<SanPhamEntity> SanPham;
	@OneToMany(mappedBy = "Mau")
	private List<SanPhamEntity> SanPham; 
	
	@OneToMany(mappedBy = "Mau")
	private List<GioHangEntity> GioHang;
}
