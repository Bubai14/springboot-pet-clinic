/**
 * 
 */
package com.playground.spring.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.playground.spring.petclinic.model.Vet;

/**
 * @author bubaibal
 *
 */
public interface VetRepository extends CrudRepository<Vet, Long> {

}
