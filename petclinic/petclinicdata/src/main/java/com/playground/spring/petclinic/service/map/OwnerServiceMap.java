/**
 * 
 */
package com.playground.spring.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.playground.spring.petclinic.model.Owner;
import com.playground.spring.petclinic.service.OwnerService;

/**
 * @author bubaibal
 *
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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
		return super.save(object);
	}
	
	@Override
	public void delete(Owner t) {
		super.delete(t);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
