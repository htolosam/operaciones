package com.tolosa.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OperationController {

	@GetMapping("/add/{num1}/{num2}")
	public ResponseEntity<Integer> addtion(@PathVariable Integer num1, @PathVariable Integer num2){
		return ResponseEntity.ok(num1 + num2);
	}
	
}
