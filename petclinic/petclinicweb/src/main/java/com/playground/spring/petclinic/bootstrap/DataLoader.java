/**
 * 
 */
package com.playground.spring.petclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.playground.spring.petclinic.model.Owner;
import com.playground.spring.petclinic.model.Pet;
import com.playground.spring.petclinic.model.PetType;
import com.playground.spring.petclinic.model.Vet;
import com.playground.spring.petclinic.service.OwnerService;
import com.playground.spring.petclinic.service.PetTypeService;
import com.playground.spring.petclinic.service.VetService;

/**
 * @author bubaibal
 *
 */
@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	

	/**
	 * @param ownerService
	 * @param vetService
	 */
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		PetType dog = new PetType();
		dog.setName("Dog");
		
		PetType savedDogType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		
		PetType savedCatType = petTypeService.save(cat);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Bubai");
		owner1.setLastName("Bal");
		owner1.setAddress("Duillya , Andul, Howrah");
		owner1.setCity("Howrah");
		owner1.setTelephone("9830540773");
		
		Pet bubaisDog = new Pet();
		bubaisDog.setBirthDate(LocalDate.now());
		bubaisDog.setName("Bosco");
		bubaisDog.setPetType(savedDogType);
		bubaisDog.setOwner(owner1);
		owner1.getPets().add(bubaisDog);
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Soma");
		owner2.setLastName("Bal");
		owner2.setAddress("Duillya , Andul, Howrah");
		owner2.setCity("Howrah");
		owner2.setTelephone("9051536512");
		
		Pet somascat = new Pet();
		somascat.setBirthDate(LocalDate.now());
		somascat.setName("Meow");
		somascat.setOwner(owner2);
		somascat.setPetType(savedCatType);
		owner2.getPets().add(somascat);
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners.....");

		Vet vet1 = new Vet();
		vet1.setFirstName("Bidhan");
		vet1.setLastName("Bal");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Sibani");
		vet2.setLastName("Bal");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets......");
		
	}

}
