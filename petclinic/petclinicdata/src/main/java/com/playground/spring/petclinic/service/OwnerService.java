/**
 * 
 */
package com.playground.spring.petclinic.service;

import com.playground.spring.petclinic.model.Owner;

/**
 * @author bubaibal
 *
 */
public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
}
