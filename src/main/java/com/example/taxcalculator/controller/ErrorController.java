package com.example.taxcalculator.controller;

import com.example.taxcalculator.model.WebResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<WebResponse<String>> missingServletRequestParameterException(MissingServletRequestParameterException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(WebResponse.<String>builder().errors(exception.getMessage()).build());
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<WebResponse<String>> methodArgumentTypeMismatchException(MethodArgumentTypeMismatchException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(WebResponse.<String>builder().errors(exception.getMessage()).build());
    }

}
