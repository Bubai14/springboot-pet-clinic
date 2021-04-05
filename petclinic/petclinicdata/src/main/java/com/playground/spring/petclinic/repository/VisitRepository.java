/**
 * 
 */
package com.playground.spring.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.playground.spring.petclinic.model.Visit;

/**
 * @author bubaibal
 *
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {

}
