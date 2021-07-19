package com.tolosa.app.models.services.impl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tolosa.app.models.services.IOperation;

@SpringBootTest
class OperationServiceImplTest {

	@Autowired
	public IOperation operationService;
	
	@Test
	void test() {
		assertTrue(operationService.add(1, 2) == 3);
	}

}
