package com.poly.dao;

import java.util.List;

import jakarta.persistence.TypedQuery;

import com.poly.commons.EntityManagerUtils;
import com.poly.entity.GioHangEntity;

import jakarta.persistence.EntityManager;

public class GioHangDao {
	EntityManager em = EntityManagerUtils.getEntityManager();

	public GioHangEntity InsertGH(GioHangEntity gh) {
		try {
			em.getTransaction().begin();
			em.persist(gh);
			em.getTransaction().commit();
			return gh;
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
		}
		return gh;
	}
	
	public List<GioHangEntity> findAllGH(int id){
		String sql ="select gh from GioHangEntity gh where gh.Users.id=:id";
		TypedQuery<GioHangEntity> query = em.createQuery(sql,GioHangEntity.class);
		query.setParameter("id",id);
		List<GioHangEntity> gh = query.getResultList();
		return gh;
	}
}
