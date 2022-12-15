package it.unicr.controller;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import it.unicr.ejb.SingletonEJB;
import it.unicr.ejb.StatefulEJB;
import it.unicr.ejb.StatelessEJB;

@RequestScoped
@Named("pluto")
public class PlutoController {
	
	@EJB
	StatefulEJB statefulEJB;
	
	@EJB
	StatelessEJB statelessEJB;
	
	@EJB
	SingletonEJB singletonEJB;

	public String getNomeStateful() {
		return statefulEJB.getName();
	}
	
	public String getNomeStateless() {
		return statelessEJB.getName();
	}
	
	public String getNomeSingleton() {
		return singletonEJB.getName();
	}

}
