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
	@Column(name="MauID")
	private int MaMau;
	@Column(name="name")
	private String name;
	@OneToMany(mappedBy = "Mau")
	private List<MauEntity> MauEntity;
}
