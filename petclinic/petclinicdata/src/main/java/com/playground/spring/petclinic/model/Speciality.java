/**
 * 
 */
package com.playground.spring.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author bubaibal
 *
 */
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

	/**
	 * Auto generated serial ID
	 */
	private static final long serialVersionUID = -2360434492846053203L;
	
	@Column(name = "description")
	private String description;

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
}
