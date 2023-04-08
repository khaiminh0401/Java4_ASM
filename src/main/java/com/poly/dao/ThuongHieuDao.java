package com.poly.dao;

import java.util.List;

import com.poly.commons.EntityManagerUtils;
import com.poly.entity.SanPhamEntity;
import com.poly.entity.ThuongHieuEntity;

import jakarta.persistence.EntityManager;

public class ThuongHieuDao {
	EntityManager em = EntityManagerUtils.getEntityManager();
	public List<ThuongHieuEntity> findAll(){
		String sql = "select th from ThuongHieuEntity th";
		return em.createQuery(sql,ThuongHieuEntity.class).getResultList();
	}
	public ThuongHieuEntity findById(Integer id) {
		return em.find(ThuongHieuEntity.class, id);
	}
}
