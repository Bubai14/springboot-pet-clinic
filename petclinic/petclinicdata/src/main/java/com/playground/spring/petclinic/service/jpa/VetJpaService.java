/**
 * 
 */
package com.playground.spring.petclinic.service.jpa;

import java.util.Collections;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.playground.spring.petclinic.model.Vet;
import com.playground.spring.petclinic.repository.VetRepository;
import com.playground.spring.petclinic.service.VetService;

/**
 * @author bubaibal
 *
 */
@Service
@Profile(value = "jpa")
public class VetJpaService implements VetService {
	
	private final VetRepository vetRepository;

	/**
	 * @param vetRepository
	 */
	public VetJpaService(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets =  Collections.emptySet();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet t) {
		return vetRepository.save(t);
	}

	@Override
	public void delete(Vet t) {
		vetRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
	}

}
