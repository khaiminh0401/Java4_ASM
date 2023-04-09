package com.poly.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SanPham")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SanPhamEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="ram")
	private String ram;
	@Column(name="screen")
	private String screen;
	@Column(name="rom")
	private String rom;
	@Column(name="published_date")
	private String published_date;
	@Column(name="hdh")
	private String hdh;
	@Column(name="price")
	private float price;
	@Column(name="quantity")
	private int quantity;
	@Column(name="logo")
	private String logo;
	@OneToMany(mappedBy = "SanPham",cascade = CascadeType.REMOVE)
	private List<HinhAnhSanPhamEntity> HinhAnh;
	@ManyToOne
	@JoinColumn(name = "math")
	private ThuongHieuEntity ThuongHieu;
//	@OneToMany(mappedBy = "SanPham")
//	private MauEntity Mau;
	@ManyToOne
	@JoinColumn(name = "mamau")
	private MauEntity Mau;
	
	@OneToMany(mappedBy = "SanPham")
	private List<GioHangEntity> GioHang;
	@OneToMany(mappedBy = "SanPham")
	private List<CTDHEntity> CTDH;
}