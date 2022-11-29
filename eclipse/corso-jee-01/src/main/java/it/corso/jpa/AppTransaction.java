package it.corso.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

public class AppTransaction {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional(value = TxType.MANDATORY) // necessita TX, ma non la crea
	public void salvaPersona() {
		Persona persona = new Persona();
		
		em.persist(persona);
	}
	
	@Transactional(value = TxType.REQUIRED) // necessita, e se non c'è già la TX, crea
	public void metodoCheFaCose() {
		
		// altre operazioni nella TX
		
		salvaPersona();
	}
	
	@Transactional(value = TxType.REQUIRES_NEW) // necessita, ma avvia sempre una nuova TX
	public void metodoCheFaDaSolo() {
		
	}
	
	@Transactional(value = TxType.NEVER) // non deve essere chiamato da un metodo già in una TX
	public void metodoSenzaTx() {
		
	}
	

}
