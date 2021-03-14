/**
 * 
 */
package com.playground.spring.petclinic.service;

import java.util.Set;

/**
 * @author bubaibal
 *
 */
public interface CrudService<T, ID> {
	
	Set<T> findAll();
	
	T findById(ID id);
	
	T save(T t);
	
	void delete(T t);
	
	void deleteById(ID id);

}
