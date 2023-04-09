package com.poly.dao;

import java.util.List;

import com.poly.commons.EntityManagerUtils;
import com.poly.entity.HinhAnhSanPhamEntity;
import com.poly.entity.SanPhamEntity;

import com.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

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
	public List<SanPhamEntity> getByName(String name){
		TypedQuery<SanPhamEntity> query = em.createQuery("select sp from SanPhamEntity sp where sp.name like :name",SanPhamEntity.class);
		query.setParameter("name", name+"%");
		return query.getResultList();
	}
	public void save(SanPhamEntity sp) {
		try {
			em.getTransaction().begin();
			em.persist(sp);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
		}
	}
	public void update(SanPhamEntity sp) {
		try {
			em.getTransaction().begin();
			em.merge(sp);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
		}
	}
	public void delete(SanPhamEntity sp) {
		try {
			em.getTransaction().begin();
			em.remove(sp);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}
}
