/**
 * 
 */
package com.playground.spring.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.playground.spring.petclinic.model.PetType;

/**
 * @author bubaibal
 *
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
