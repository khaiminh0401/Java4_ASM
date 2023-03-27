package com.poly.entity;

import jakarta.persistence.Entity;
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
	private int id;
	private String name;
}
