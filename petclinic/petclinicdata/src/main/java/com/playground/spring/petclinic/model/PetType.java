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
@Table(name = "types")
public class PetType extends BaseEntity{

	/**
	 * Auto Generated Serial ID
	 */
	private static final long serialVersionUID = 4045068348752377749L;
	
	@Column(name = "name")
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
