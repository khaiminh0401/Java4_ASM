package com.poly.dao;

import java.util.List;

import com.poly.commons.EntityManagerUtils;
import com.poly.entity.MauEntity;

import jakarta.persistence.EntityManager;

public class MauDao {
	EntityManager em = EntityManagerUtils.getEntityManager();
	public List<MauEntity> selectAll(){
		String sql = "select m from MauEntity m";
		return em.createQuery(sql,MauEntity.class).getResultList();
	}
	public MauEntity findById(Integer id) {
		return em.find(MauEntity.class, id);
	}
}
