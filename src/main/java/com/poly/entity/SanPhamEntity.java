package com.poly.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SanPham")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPhamEntity {
	@Id
	@Column(name="SpID")
	private int SpID;
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
	private boolean hdh;
	@Column(name="price")
	private double price;
	@Column(name="quantity")
	private int quantity;
	@OneToOne(mappedBy = "SanPham")
	private List<HinhAnhSanPhamEntity> HinhAnhEntity;
	@ManyToOne
	@JoinColumn(name = "ThID")
	private ThuongHieuEntity ThuongHieuEntity;
	@ManyToOne
	@JoinColumn(name = "MauID")
	private MauEntity MauEntity;

}
