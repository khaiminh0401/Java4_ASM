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
@Table(name="CTDH")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CTDHEntity {
	@Id
	@ManyToOne
	@JoinColumn(name="madh")
	private DonHangEntity DonHang;
	
	@Id
	@ManyToOne
	@JoinColumn(name="masp")
	private SanPhamEntity SanPham;
	
	@Column(name="quantity")
	private int quantity;
}
