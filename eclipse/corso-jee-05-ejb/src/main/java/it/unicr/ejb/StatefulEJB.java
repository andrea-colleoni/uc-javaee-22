package it.unicr.ejb;

import javax.ejb.Singleton;
import javax.ejb.Stateful;

//@Stateful
@Singleton
public class StatefulEJB {
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
