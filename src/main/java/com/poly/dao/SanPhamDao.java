package com.poly.dao;

import java.util.List;

import com.poly.commons.EntityManagerUtils;
import com.poly.entity.HinhAnhSanPhamEntity;
import com.poly.entity.SanPhamEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class SanPhamDao {
	EntityManager em = EntityManagerUtils.getEntityManager();

	public List<SanPhamEntity> selectAll(){
		String sql = "select sp from SanPhamEntity sp";
		return em.createQuery(sql, SanPhamEntity.class).getResultList();
	}
	public List<HinhAnhSanPhamEntity> selectAll2(){
		String sql = "select sp from HinhAnhSanPhamEntity sp";
		return em.createQuery(sql, HinhAnhSanPhamEntity.class).getResultList();
	}
	public SanPhamEntity getById(int id) {
		return em.find(SanPhamEntity.class, id);
	}
	public List<SanPhamEntity> getByMaThuongHieu(Integer mathuonghieu){
		String sql = "select sp from SanPhamEntity sp where sp.ThuongHieu.id = :mathuonghieu";
		TypedQuery<SanPhamEntity> query = em.createQuery(sql,SanPhamEntity.class);
		query.setParameter("mathuonghieu", mathuonghieu);
		return query.getResultList();
	}
}
