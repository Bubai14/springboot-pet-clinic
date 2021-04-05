/**
 * 
 */
package com.playground.spring.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.playground.spring.petclinic.model.Speciality;

/**
 * @author bubaibal
 *
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {

}
