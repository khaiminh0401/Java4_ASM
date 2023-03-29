package com.poly.dao;

import java.util.List;

import com.poly.commons.EntityManagerUtils;
import com.poly.entity.HinhAnhSanPhamEntity;
import com.poly.entity.SanPhamEntity;

import jakarta.persistence.EntityManager;

public class SanPhamDao {
	public List<HinhAnhSanPhamEntity> selectAll(){
		EntityManager em = EntityManagerUtils.getEntityManager();
		String sql = "select sp from HinhAnhSanPhamEntity sp";
		return em.createQuery(sql, HinhAnhSanPhamEntity.class).getResultList();
	}
	
	public List<SanPhamEntity> findSP(){
		EntityManager em = EntityManagerUtils.getEntityManager();
		String sql = "select sp from SanPhamEntity sp";
		return em.createQuery(sql, SanPhamEntity.class).getResultList();
	}
}
