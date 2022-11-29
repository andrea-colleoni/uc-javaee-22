package it.corso.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(
			name = "indirizzo.perCognome", 
			query = "select i.citta from Indirizzo i where i.persona.cognome like CONCAT(:iniziale, '%')")
})
@Entity
public class Indirizzo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idIndirizzo;
	private String via;
	private Integer civico;
	private String citta;
	
	// non funziona con MappedSuperclass
	@ManyToOne(fetch = FetchType.EAGER)
	private Persona persona;
	/**
	 * @return the via
	 */
	public String getVia() {
		return via;
	}
	/**
	 * @param via the via to set
	 */
	public void setVia(String via) {
		this.via = via;
	}
	/**
	 * @return the civico
	 */
	public Integer getCivico() {
		return civico;
	}
	/**
	 * @param civico the civico to set
	 */
	public void setCivico(Integer civico) {
		this.civico = civico;
	}
	/**
	 * @return the citta
	 */
	public String getCitta() {
		return citta;
	}
	/**
	 * @param citta the citta to set
	 */
	public void setCitta(String citta) {
		this.citta = citta;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Indirizzo [via=" + via + ", civico=" + civico + ", citta=" + citta + "]";
	}
	/**
	 * @return the idIndirizzo
	 */
	public Integer getIdIndirizzo() {
		return idIndirizzo;
	}
	/**
	 * @param idIndirizzo the idIndirizzo to set
	 */
	public void setIdIndirizzo(Integer idIndirizzo) {
		this.idIndirizzo = idIndirizzo;
	}
	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	

}
