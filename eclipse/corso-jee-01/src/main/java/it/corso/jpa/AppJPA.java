package it.corso.jpa;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppJPA {

	public static void main(String[] args) {
		
		// Persistence: contiene la configurazione di JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager em = emf.createEntityManager();
		
//		Persona p = new Persona();
//		p.setNome("Mario");
//		p.setCognome("Rossi");
//		p.setEmail("mario@rossi");
//		p.setIndirizzi(new ArrayList<Indirizzo>());
//		Indirizzo i = new Indirizzo();
//		i.setCitta("Roma");
//		i.setCivico(1);
//		i.setVia("via");
//		// creo un doppio collegamento tra le entità
//		i.setPersona(p);
//		p.getIndirizzi().add(i);
//		
//		em.getTransaction().begin();
//		// sincronizzazione con il DB (racchiusa in una TX)
//		em.persist(p);
//		em.getTransaction().commit();
		
		Persona mario = em.find(Persona.class, "mario@rossi");
		
		System.out.println(mario.getIndirizzi().get(0).getCitta());
		
//		em.getTransaction().begin();
//		mario.setCognome("Rossi");
//		em.getTransaction().commit();
		//System.out.println(anna);

	}

}
