/**
 * 
 */
package com.playground.spring.petclinic.model;

import java.util.Set;

/**
 * @author bubaibal
 *
 */
public class Owner extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1683129615919090932L;
	private Set<Pet> pets;
	/**
	 * @return the pets
	 */
	public Set<Pet> getPets() {
		return pets;
	}
	/**
	 * @param pets the pets to set
	 */
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	
}
