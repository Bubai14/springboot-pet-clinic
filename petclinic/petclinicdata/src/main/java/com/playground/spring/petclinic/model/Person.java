/**
 * 
 */
package com.playground.spring.petclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author bubaibal
 *
 */
@MappedSuperclass
public class Person extends BaseEntity{

	/**
	 * Auto generated serial ID
	 */
	private static final long serialVersionUID = -1343917146298414861L;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
