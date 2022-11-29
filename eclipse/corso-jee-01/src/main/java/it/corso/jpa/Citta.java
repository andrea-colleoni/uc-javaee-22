package it.corso.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ChiaveCitta.class)
public class Citta {

	@Id
	private String nome;
	@Id
	private String capPrincipale;
	
//	@EmbeddedId // serve per usare come chiave una classe
//	private ChiaveCitta chiaveCitta;
	
	// Embedded =>  JPQL query select c from Citta c where c.chiaveCitta.nome = '...'
	// IdClass =>  JPQL query select c from Citta c where c.nome = '...'
	
	private String regione;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the capPrincipale
	 */
	public String getCapPrincipale() {
		return capPrincipale;
	}

	/**
	 * @param capPrincipale the capPrincipale to set
	 */
	public void setCapPrincipale(String capPrincipale) {
		this.capPrincipale = capPrincipale;
	}

	/**
	 * @return the regione
	 */
	public String getRegione() {
		return regione;
	}

	/**
	 * @param regione the regione to set
	 */
	public void setRegione(String regione) {
		this.regione = regione;
	}
	
	
}
