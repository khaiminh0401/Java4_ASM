package com.poly.dao;

import java.util.List;

import com.poly.commons.EntityManagerUtils;
import com.poly.entity.UserEntity;

import com.poly.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class UserDao {
	private EntityManager em = EntityManagerUtils.getEntityManager();

	public List<UserEntity> selectAll() {
		return em.createQuery("select u from SanPhamEntity u", UserEntity.class).getResultList();
	}

	public UserEntity findById(int id) {
		return em.find(UserEntity.class, id);
	}
	public List<UserEntity> findKH(){
		return em.createQuery("select u from UserEntity u where u.isAdmin='false'", UserEntity.class).getResultList();
	}
}
