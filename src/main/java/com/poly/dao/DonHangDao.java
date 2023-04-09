package com.poly.dao;

import com.poly.commons.EntityManagerUtils;
import com.poly.entity.DonHangEntity;

import jakarta.persistence.EntityManager;

public class DonHangDao {
	EntityManager em = EntityManagerUtils.getEntityManager();
	public DonHangEntity InsertDH(DonHangEntity dh) {
		try {
			em.getTransaction().begin();
			em.persist(dh);
			em.getTransaction().commit();
			return dh;
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
		}
		return dh;
	}
	
}
