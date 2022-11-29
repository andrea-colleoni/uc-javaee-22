package it.corso.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMSingleton {
	
	private static EMSingleton instance;
	
	private EntityManagerFactory emf;
	
	private EMSingleton() {
		emf = Persistence.createEntityManagerFactory("persistence-unit");
	}
	
	public static EMSingleton getInstance() {
		if(instance == null) {
			instance = new EMSingleton();
		}
		return instance;
	}
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
