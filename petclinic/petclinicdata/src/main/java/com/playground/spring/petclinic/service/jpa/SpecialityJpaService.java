/**
 * 
 */
package com.playground.spring.petclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.playground.spring.petclinic.model.Speciality;
import com.playground.spring.petclinic.repository.SpecialityRepository;
import com.playground.spring.petclinic.service.SpecialityService;

/**
 * @author bubaibal
 *
 */
@Service
@Profile(value = "jpa")
public class SpecialityJpaService implements SpecialityService {
	
	private final SpecialityRepository specialityRepository;

	/**
	 * @param specialityRepository
	 */
	public SpecialityJpaService(SpecialityRepository specialityRepository) {
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<>();
		specialityRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		return specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality t) {
		return specialityRepository.save(t);
	}

	@Override
	public void delete(Speciality t) {
		specialityRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		specialityRepository.deleteById(id);
	}

}
