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
@Table(name="HinhAnhSanPham")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HinhAnhSanPhamEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "url")
	private String url;

	@ManyToOne
	@JoinColumn(name = "masp")
	private SanPhamEntity SanPham;
}
