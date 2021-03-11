/**
 * 
 */
package com.playground.spring.petclinic.service;

import java.util.Set;

import com.playground.spring.petclinic.model.Pet;

/**
 * @author bubaibal
 *
 */
public interface PetService {

	Pet findById(Long Id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
