/**
 * 
 */
package com.playground.spring.petclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.playground.spring.petclinic.model.Owner;
import com.playground.spring.petclinic.repository.OwnerRepository;
import com.playground.spring.petclinic.service.OwnerService;

/**
 * @author bubaibal
 *
 */
@Service
@Profile(value = "jpa")
public class OwnerJpaService implements OwnerService {

	private final OwnerRepository ownerRepository;

	/**
	 * @param ownerRepository
	 */
	public OwnerJpaService(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		// Return null from Optional if owner is not found by the id.
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner t) {
		return ownerRepository.save(t);
	}

	@Override
	public void delete(Owner t) {
		ownerRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

}
