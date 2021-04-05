/**
 * 
 */
package com.playground.spring.petclinic.service.jpa;

import java.util.Collections;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.playground.spring.petclinic.model.Pet;
import com.playground.spring.petclinic.repository.PetRepository;
import com.playground.spring.petclinic.service.PetService;

/**
 * @author bubaibal
 *
 */
@Service
@Profile(value = "jpa")
public class PetJpaService implements PetService {
	
	private final PetRepository petRepository;

	/**
	 * @param petRepository
	 */
	public PetJpaService(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = Collections.emptySet();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet t) {
		return petRepository.save(t);
	}

	@Override
	public void delete(Pet t) {
		petRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}

}
