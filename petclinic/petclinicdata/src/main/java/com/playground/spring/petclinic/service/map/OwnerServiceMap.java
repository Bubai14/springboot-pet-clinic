/**
 * 
 */
package com.playground.spring.petclinic.service.map;

import java.util.Set;

import com.playground.spring.petclinic.model.Owner;
import com.playground.spring.petclinic.service.CrudService;

/**
 * @author bubaibal
 *
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public void delete(Owner t) {
		super.delete(t);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
