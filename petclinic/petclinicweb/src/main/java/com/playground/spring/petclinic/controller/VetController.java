/**
 * 
 */
package com.playground.spring.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author bubaibal
 *
 */
@Controller
public class VetController {

	@GetMapping({"/vets", "/vets/index", "/vets/index.html"})
	public String listVets() {
		return "vets/index";
	}
}
