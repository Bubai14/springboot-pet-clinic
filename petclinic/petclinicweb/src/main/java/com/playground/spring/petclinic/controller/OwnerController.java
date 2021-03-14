/**
 * 
 */
package com.playground.spring.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bubaibal
 *
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

	@GetMapping({"", "/","/index.html", "/index"})
	public String listOwners() {
		return "owners/index";
	}
	
}
