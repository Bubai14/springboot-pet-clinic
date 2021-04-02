/**
 * 
 */
package com.playground.spring.petclinic.model;

import java.util.Set;

/**
 * @author bubaibal
 *
 */
public class Vet extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4203845296948333130L;
	
	private Set<Speciality> specialities;

	/**
	 * @return the specialities
	 */
	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	/**
	 * @param specialities the specialities to set
	 */
	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}

}
