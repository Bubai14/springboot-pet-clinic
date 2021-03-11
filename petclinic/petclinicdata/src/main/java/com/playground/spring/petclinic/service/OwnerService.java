/**
 * 
 */
package com.playground.spring.petclinic.service;

import java.util.Set;

import com.playground.spring.petclinic.model.Owner;

/**
 * @author bubaibal
 *
 */
public interface OwnerService {

	Owner findByLastName(String lastName);
	
	Owner findById(Long Id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
