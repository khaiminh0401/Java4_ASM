package com.poly.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "HinhAnhSanPham")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HinhAnhSanPhamEntity {
	@Id
	@Column(name = "HinhID")
	private int HinhID;
	@Column(name = "url")
	private String url;

	@OneToOne
	@JoinColumn(name = "SpID")
	private SanPhamEntity SanPhamEntity;

}
