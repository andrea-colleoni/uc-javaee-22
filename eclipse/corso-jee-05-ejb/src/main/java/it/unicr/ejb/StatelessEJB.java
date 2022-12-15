package it.unicr.ejb;

import javax.ejb.Stateless;

@Stateless
public class StatelessEJB {
	
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
