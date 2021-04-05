/**
 * 
 */
package com.playground.spring.petclinic.service.jpa;

import java.util.Collections;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.playground.spring.petclinic.model.PetType;
import com.playground.spring.petclinic.repository.PetTypeRepository;
import com.playground.spring.petclinic.service.PetTypeService;

/**
 * @author bubaibal
 *
 */
@Service
@Profile(value = "jpa")
public class PetTypeJpaService implements PetTypeService {

	private final PetTypeRepository petTypeRepository;

	/**
	 * @param petTypeRepository
	 */
	public PetTypeJpaService(PetTypeRepository petTypeRepository) {
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = Collections.emptySet();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType t) {
		return petTypeRepository.save(t);
	}

	@Override
	public void delete(PetType t) {
		petTypeRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);
	}

}
