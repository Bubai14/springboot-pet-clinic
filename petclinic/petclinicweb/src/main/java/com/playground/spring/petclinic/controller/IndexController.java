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
public class IndexController {
	
	@GetMapping({"", "/", "index","index.html"})
	public String index() {
		return "index";
	}

	@GetMapping({"/oups"})
	public String oups() {
		return "notimplemented";
	}
}
