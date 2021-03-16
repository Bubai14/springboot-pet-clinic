/**
 * 
 */
package com.playground.spring.petclinic.service.map;

import java.util.Set;

import com.playground.spring.petclinic.model.Vet;
import com.playground.spring.petclinic.service.VetService;

/**
 * @author bubaibal
 *
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

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
		return super.save(object.getId(), object);
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
