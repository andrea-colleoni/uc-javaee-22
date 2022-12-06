package it.unicr.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

// per renderlo visibile in EL
@Named
@SessionScoped
public class Esempio implements Serializable {
	
	
	public Esempio() {
	}

	public String getTesto() {
		return "Testo elaborato in Java";
	}

}
