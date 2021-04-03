/**
 * 
 */
package com.playground.spring.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.playground.spring.petclinic.service.OwnerService;

/**
 * @author bubaibal
 *
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	private final OwnerService ownerService;
	

	/**
	 * @param ownerService
	 */
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}



	@GetMapping({"", "/","/index.html", "/index"})
	public String listOwners(Model model) {
		
		model.addAttribute("owners", ownerService.findAll());
		
		return "owners/index";
	}
	
	@RequestMapping("/find")
	public String findOwners() {
		return "notimplemented";
	}
	
}
