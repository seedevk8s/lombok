package kr.co.ezenac.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EzenController {

	@GetMapping("/ezen-it")
	public String ezenItAcademy() {
		return "ezen-it-academy!";
	}
	
}
