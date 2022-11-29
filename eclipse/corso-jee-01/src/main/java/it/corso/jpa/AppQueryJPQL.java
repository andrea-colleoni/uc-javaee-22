package it.corso.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class AppQueryJPQL {

	public static void main(String[] args) {
		
		EntityManager em = EMSingleton.getInstance().getEntityManager();
		TypedQuery<Persona> q = em.createNamedQuery("persona.elenco", Persona.class);
		
		List<Persona> persone = q.getResultList();
		for(Persona p : persone) {
			System.out.println(p);
		}
		System.out.println("----------------------------------------------");
		em = EMSingleton.getInstance().getEntityManager();
		q = em.createNamedQuery("persona.perInizialeNome", Persona.class);
		q.setParameter("iniziale", "A%");
		
		for(Persona p : q.getResultList()) {
			System.out.println(p);
		}
		System.out.println("----------------------------------------------");
		q = em.createNamedQuery("persona.perInizialeCognome", Persona.class);
		q.setParameter("iniziale", "R");
		
		for(Persona p : q.getResultList()) {
			System.out.println(p);
		}
		System.out.println("------------CITTA-----------------------");
		TypedQuery<String> q2 = em.createNamedQuery("indirizzo.perCognome", String.class);
		q2.setParameter("iniziale", "R");
		
		for(String citta : q2.getResultList()) {
			System.out.println(citta);
		}	
		System.out.println("------------NATIVA-----------------------");
		// query nativa
		Query q3 = em.createNativeQuery("select * from persona", Persona.class);
		for(Persona p : (List<Persona>)q3.getResultList()) {
			System.out.println(p);
		}
	}

}
