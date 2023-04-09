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
<<<<<<< HEAD
	
	

	public UserEntity create(UserEntity entity) {
		try {
			em.getTransaction().begin();

			em.persist(entity);// them

			em.getTransaction().commit();
			return entity;
		} catch (Exception e) {

			em.getTransaction().rollback();
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}

	public UserEntity remove(int id) {
		try {
			em.getTransaction().begin();
			UserEntity entity = this.findById(id);
			em.remove(entity);
			em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}

	public List<UserEntity> findKH(){
		return em.createQuery("select u from UserEntity u where u.isAdmin='false'", UserEntity.class).getResultList();

=======
	public List<UserEntity> findKH(){
		return em.createQuery("select u from UserEntity u where u.isAdmin='false'", UserEntity.class).getResultList();
>>>>>>> origin/master
	}
}
