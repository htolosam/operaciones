package com.tolosa.app.models.services.impl;

import org.springframework.stereotype.Service;

import com.tolosa.app.models.services.IOperation;

@Service
public class OperationServiceImpl implements IOperation {
	
	@Override
	public Integer add(Integer num1, Integer num2) {
		return num1 + num2;
	}

}
