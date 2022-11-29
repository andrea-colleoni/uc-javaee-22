package it.corso.jpa;

import java.io.Serializable;

public class ChiaveCitta implements Serializable {

	private String nome;
	private String capPrincipale;
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
	
	
}
