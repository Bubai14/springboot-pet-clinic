/**
 * 
 */
package com.playground.spring.petclinic.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.playground.spring.petclinic.model.Owner;
import com.playground.spring.petclinic.service.OwnerService;
import com.playground.spring.petclinic.service.PetService;
import com.playground.spring.petclinic.service.PetTypeService;

/**
 * @author bubaibal
 *
 */
@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
	
	private final PetTypeService petTypeService;
	private final PetService petService;

	/**
	 * @param petTypeService
	 * @param petService
	 */
	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

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
		
		if(object != null) {
			if(object.getPets() != null) {
				object.getPets().forEach(pet -> {
					if(pet.getPetType() != null) {
						if(pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet Type is required");
					}
					if(pet.getId() == null) {
						pet.setId(petService.save(pet).getId());
					}
				});
			}
			return super.save(object);
		} else {
			return null;
		}
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
