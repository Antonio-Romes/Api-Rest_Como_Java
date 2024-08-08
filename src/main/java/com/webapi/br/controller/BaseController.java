package com.webapi.br.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.webapi.br.validation.ValidationExceptionHandler;

public abstract class BaseController {
	@ExceptionHandler
    public ResponseEntity<Map<String, String>> handleValidationException(MethodArgumentNotValidException ex) {
        return new ValidationExceptionHandler().handleValidationException(ex);
    }
}
