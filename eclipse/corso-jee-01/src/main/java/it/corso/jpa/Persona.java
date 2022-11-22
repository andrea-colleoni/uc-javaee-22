package it.corso.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "TBL_PRS")
public class Persona implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// POJO usando JavaBean
	@Column(name = "NM001")
	private String nome;
	private String cognome;
	@Id
	private String email;
	
	@OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Indirizzo> indirizzi;
	
	public void addIndirizzo(Indirizzo i) {
		if (indirizzi == null) {
			indirizzi = new ArrayList<Indirizzo>();
		}
		indirizzi.add(i);
		i.setPersona(this);
	}
	
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
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", email=" + email + "]";
	}
	/**
	 * @return the indirizzi
	 */
	public List<Indirizzo> getIndirizzi() {
		return indirizzi;
	}
	/**
	 * @param indirizzi the indirizzi to set
	 */
	public void setIndirizzi(List<Indirizzo> indirizzi) {
		this.indirizzi = indirizzi;
	}
	
	
}
