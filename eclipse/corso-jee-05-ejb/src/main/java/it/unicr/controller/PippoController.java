package it.unicr.controller;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import it.unicr.ejb.SingletonEJB;
import it.unicr.ejb.StatefulEJB;
import it.unicr.ejb.StatelessEJB;

@RequestScoped
@Named("pippo")
public class PippoController {
	
	@EJB
	StatefulEJB statefulEJB;
	
	@EJB
	StatelessEJB statelessEJB;
	
	@EJB
	SingletonEJB singletonEJB;

	private String nome;
	
	public void impostaStateful() {
		statefulEJB.setName(getNome());
	}
	
	public void impostaStateless() {
		statelessEJB.setName(getNome());
	}
	
	public void impostaSingleton() {
		singletonEJB.setName(getNome());
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


}
