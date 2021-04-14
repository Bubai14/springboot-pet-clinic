/**
 * 
 */
package com.playground.spring.petclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.playground.spring.petclinic.model.Visit;
import com.playground.spring.petclinic.repository.VisitRepository;
import com.playground.spring.petclinic.service.VisitService;

/**
 * @author bubaibal
 *
 */
@Service
@Profile(value = "jpa")
public class VisitJpaService implements VisitService {

	private final VisitRepository visitRepository;

	/**
	 * @param visitRepository
	 */
	public VisitJpaService(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> visits = new HashSet<>();
		visitRepository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public Visit findById(Long id) {
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit t) {
		return visitRepository.save(t);
	}

	@Override
	public void delete(Visit t) {
		visitRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		visitRepository.deleteById(id);
	}

}
