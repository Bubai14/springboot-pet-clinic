/**
 * 
 */
package com.playground.spring.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.playground.spring.petclinic.model.Owner;

/**
 * @author bubaibal
 *
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
