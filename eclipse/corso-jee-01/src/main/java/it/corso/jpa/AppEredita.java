package it.corso.jpa;

import javax.persistence.EntityManager;

public class AppEredita {

	public static void main(String[] args) {
		EntityManager em = EMSingleton.getInstance().getEntityManager();
		
		Studente s = new Studente();
		s.setEmail("email-stud");
		s.setNomeScuola("itis");
		
		Persona p = new Persona();
		p.setEmail("email-pers");

		em.getTransaction().begin();
		em.persist(s);
		em.persist(p);
		em.getTransaction().commit();
		
		for(Persona p1 : em.createNamedQuery("persona.elenco", Persona.class).getResultList()) {
			System.out.println(p1);
		}
	}

}
