/**
 * 
 */
package com.playground.spring.petclinic.model;

import java.time.LocalDate;

/**
 * @author bubaibal
 *
 */
public class Visit extends BaseEntity {

	/**
	 * Auto generated serial ID
	 */
	private static final long serialVersionUID = 4301999264550759529L;
	
	private LocalDate date;
	
	private String description;
	
	private Pet pet;

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the pet
	 */
	public Pet getPet() {
		return pet;
	}

	/**
	 * @param pet the pet to set
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	

}
