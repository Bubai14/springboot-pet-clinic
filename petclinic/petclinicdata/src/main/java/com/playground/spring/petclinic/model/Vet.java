/**
 * 
 */
package com.playground.spring.petclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author bubaibal
 *
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {

	/**
	 * Auto generated serial ID
	 */
	private static final long serialVersionUID = 4203845296948333130L;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vet_specialities", 
		joinColumns = @JoinColumn(name = "vet_id"), 
		inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	private Set<Speciality> specialities = new HashSet<>();

	/**
	 * @return the specialities
	 */
	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	/**
	 * @param specialities the specialities to set
	 */
	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}

}
