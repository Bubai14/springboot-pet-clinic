/**
 * 
 */
package com.playground.spring.petclinic.model;

/**
 * @author bubaibal
 *
 */
public class Person extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1343917146298414861L;
	private String firstName;
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
