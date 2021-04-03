/**
 * 
 */
package com.playground.spring.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.playground.spring.petclinic.model.Vet;
import com.playground.spring.petclinic.service.SpecialityService;
import com.playground.spring.petclinic.service.VetService;

/**
 * @author bubaibal
 *
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialityService specialityService;
	
	/**
	 * @param specialityService
	 */
	public VetServiceMap(SpecialityService specialityService) {
		this.specialityService = specialityService;
	}

	@Override
	public Set<Vet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Vet save(Vet object) {
		if(object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(speciality -> {
				if(speciality.getId() == null) {
					speciality.setId(specialityService.save(speciality).getId());
				}
			});
		}
		return super.save(object);
	}
	
	@Override
	public void delete(Vet t) {
		super.delete(t);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
}
