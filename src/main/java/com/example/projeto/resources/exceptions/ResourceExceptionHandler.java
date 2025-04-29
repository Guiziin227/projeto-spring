package com.example.projeto.resources.exceptions;

import com.example.projeto.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(Exception ex, HttpServletRequest request) {
        String error = ex.getMessage();
        HttpStatus status = HttpStatus.NOT_FOUND;

        StandardError err = new StandardError(Instant.now(), status.value(), "Resource not found", error, request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
