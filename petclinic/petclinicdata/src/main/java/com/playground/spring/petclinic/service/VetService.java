/**
 * 
 */
package com.playground.spring.petclinic.service;

import java.util.Set;

import com.playground.spring.petclinic.model.Vet;

/**
 * @author bubaibal
 *
 */
public interface VetService {

	Vet findById(Long Id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
