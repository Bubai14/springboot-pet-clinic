/**
 * 
 */
package com.playground.spring.petclinic.model;

/**
 * @author bubaibal
 *
 */
public class PetType extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4045068348752377749L;
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
