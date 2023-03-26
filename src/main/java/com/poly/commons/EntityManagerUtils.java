package com.poly.commons;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtils {
	 private static EntityManagerFactory factory;
	 static public EntityManager getEntityManager() {
		 if(factory == null || !factory.isOpen()) {
			 factory = Persistence.createEntityManagerFactory("Java4_ASM");
		 }
		 return factory.createEntityManager();
	 }
	 static public void shutdown() {
		 if(factory != null && factory.isOpen()) {
			 factory.close();
		 }
		 factory = null;
	 }
}
