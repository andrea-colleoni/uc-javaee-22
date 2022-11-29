package it.corso.jpa;

import javax.persistence.EntityManager;

public class AppChiaveComposita {

	public static void main(String[] args) {
		EntityManager em = EMSingleton.getInstance().getEntityManager();
		
		Citta c = new Citta();
		c.setNome("Barcellona");
		c.setCapPrincipale("123");
		c.setRegione("Sicilia");
		
		Citta c2 = new Citta();
		c2.setNome("Barcellona");
		c2.setCapPrincipale("321");
		c2.setRegione("Spagna");
		
		em.getTransaction().begin();
		em.persist(c);
		em.persist(c2);
		em.getTransaction().commit();
		
	}
}
