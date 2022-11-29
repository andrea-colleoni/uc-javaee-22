package it.corso.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@NamedQueries({
	@NamedQuery(
			name = "persona.elenco", 
			query = "select p from Persona p"),
	@NamedQuery(
			name = "persona.perInizialeNome", 
			query = "select p from Persona p where p.nome like :iniziale"),
	@NamedQuery(
			name = "persona.perInizialeCognome", 
			query = "select p from Persona p where p.cognome like CONCAT(:iniziale, '%')")
})
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // la superclasse deve essere abstract
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// POJO usando JavaBean
//	@Column(name = "NM001")
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
