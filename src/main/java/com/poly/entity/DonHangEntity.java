package com.poly.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DonHang")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonHangEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Temporal(TemporalType.DATE)
	@Column(name ="buy_date")
	private Date buy_date = new Date();
	
	@ManyToOne
	@JoinColumn(name = "makhachhang")
	private UserEntity user;
	
	@OneToMany(mappedBy = "DonHang")
	private List<CTDHEntity> CTDH;
}
