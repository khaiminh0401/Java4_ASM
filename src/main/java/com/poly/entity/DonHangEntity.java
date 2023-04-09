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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DonHang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DonHangEntity {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "soluongdh")
	private int soluongdh;
	
	@Temporal(TemporalType.DATE)
	private Date ngaymua = new Date();
	
	@ManyToOne
	@JoinColumn(name = "ghid")
	private GioHangEntity GioHang;
}
