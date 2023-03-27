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
@Table(name="ThuongHieu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThuongHieuEntity {
	@Id
	@Column(name="ThID")
	private int ThId;
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "ThuongHieu")
	private List<SanPhamEntity> SanPhamEntity;
}
