/**
 * 
 */
package com.playground.spring.petclinic.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author bubaibal
 *
 */
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{
	
	/**
	 * Auto generated serial ID
	 */
	private static final long serialVersionUID = -2112850313105491164L;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private PetType petType;
	
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;
	
	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
	private Set<Visit> visits = Collections.emptySet();
	
	/**
	 * @return the petType
	 */
	public PetType getPetType() {
		return petType;
	}
	/**
	 * @param petType the petType to set
	 */
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	/**
	 * @return the owner
	 */
	public Owner getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	/**
	 * @return the birthDate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the visits
	 */
	public Set<Visit> getVisits() {
		return visits;
	}
	/**
	 * @param visits the visits to set
	 */
	public void setVisits(Set<Visit> visits) {
		this.visits = visits;
	}
}
