/**
 * 
 */
package com.playground.spring.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.playground.spring.petclinic.model.Pet;

/**
 * @author bubaibal
 *
 */
public interface PetRepository extends CrudRepository<Pet, Long> {

}
