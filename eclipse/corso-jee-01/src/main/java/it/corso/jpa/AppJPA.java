package it.corso.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppJPA {

	public static void main(String[] args) {
		
		// Persistence: contiene la configurazione di JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager em = emf.createEntityManager();
		
		Persona p = new Persona();
		p.setNome("Mario");
		p.setCognome("Rossi");
		p.setEmail("mario@rossi");
		
		em.getTransaction().begin();
		// sincronizzazione con il DB (racchiusa in una TX)
		em.persist(p);
		em.getTransaction().commit();

	}

}
