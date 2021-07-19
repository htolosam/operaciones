package com.tolosa.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tolosa.app.models.services.IOperation;

@RestController
@RequestMapping("/api")
public class OperationController {

	@Autowired
	private IOperation operationService;
	
	@GetMapping("/add/{num1}/{num2}")
	public ResponseEntity<Integer> addtion(@PathVariable Integer num1, @PathVariable Integer num2){
		return ResponseEntity.ok(operationService.add(num1, num2));
	}
	
}
