package com.prg.services.inventory.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.prg.services.inventory.common.exception.ErrorObject;
import com.prg.services.inventory.common.exception.ProductNotFoundException;

@RestControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<ErrorObject> handleProductNotFoundException(ProductNotFoundException pnfe) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorObject(pnfe.getMessage(), 404));
	}

}
