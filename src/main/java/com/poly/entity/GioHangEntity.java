package com.poly.entity;

import jakarta.persistence.UniqueConstraint;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="GioHang", uniqueConstraints = { @UniqueConstraint(columnNames = { "userid", "masp" }) })
public class GioHangEntity {


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="masp")
	private SanPhamEntity SanPham;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private UserEntity Users;
	
	@ManyToOne
	@JoinColumn(name="mamau") 
	private MauEntity Mau;
	
	@Column(name="soluong")
	private int soluong;
	
	@OneToMany(mappedBy = "GioHang")
	private List<DonHangEntity> DonHang;



}
