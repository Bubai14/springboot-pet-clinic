/**
 * 
 */
package com.playground.spring.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.playground.spring.petclinic.model.Speciality;
import com.playground.spring.petclinic.service.SpecialityService;

/**
 * @author bubaibal
 *
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality t) {
		return super.save(t);
	}

	@Override
	public void delete(Speciality t) {
		super.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
