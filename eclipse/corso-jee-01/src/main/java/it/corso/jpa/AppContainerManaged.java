package it.corso.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AppContainerManaged {
	
	@PersistenceContext
	EntityManager em;
	
	public void metodo() {
		//em.createNamedQuery(null, null)
		
		// l'em viene dal container
	}

}
