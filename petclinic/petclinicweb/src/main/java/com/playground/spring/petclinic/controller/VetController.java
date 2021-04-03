/**
 * 
 */
package com.playground.spring.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.playground.spring.petclinic.service.VetService;

/**
 * @author bubaibal
 *
 */
@Controller
public class VetController {
	
	private final VetService vetService;
	

	/**
	 * @param vetService
	 */
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}



	@GetMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"}) 
	public String listVets(Model model) {
		
		model.addAttribute("vets", vetService.findAll());
		
		return "vets/index";
	}
}
