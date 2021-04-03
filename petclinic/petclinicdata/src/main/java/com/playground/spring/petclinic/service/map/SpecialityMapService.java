/**
 * 
 */
package com.playground.spring.petclinic.service.map;

import java.util.Set;

import com.playground.spring.petclinic.model.Speciality;
import com.playground.spring.petclinic.service.SpecialitiesService;

/**
 * @author bubaibal
 *
 */
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {

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
