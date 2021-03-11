/**
 * 
 */
package com.playground.spring.petclinic.model;

import java.io.Serializable;

/**
 * @author bubaibal
 *
 */
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7662069729198382751L;

	private Long id;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
}
