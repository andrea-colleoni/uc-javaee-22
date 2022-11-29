package it.corso.jpa;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class Studente extends Persona {

	private String nomeScuola;

	/**
	 * @return the nomeScuola
	 */
	public String getNomeScuola() {
		return nomeScuola;
	}

	/**
	 * @param nomeScuola the nomeScuola to set
	 */
	public void setNomeScuola(String nomeScuola) {
		this.nomeScuola = nomeScuola;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return super.toString() + "Studente [nomeScuola=" + nomeScuola + "]";
	}
	
	
	
}
