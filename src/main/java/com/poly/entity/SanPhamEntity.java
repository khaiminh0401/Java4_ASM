package com.poly.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="SanPhamEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPhamEntity {
	private int id;
	private String name;
	private String ram;
	private String screen;
	private String rom;
	private String published_date;
	private boolean hdh;
	private double price;
	private int quantity;
	private int math;
	private int mamau;
}
