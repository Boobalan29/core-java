package com.Insurance.HealthInsurancePolicy.ExceptionHandler;

import com.Insurance.HealthInsurancePolicy.Entity.Policy;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(EntityNotFoundException.class)
ResponseEntity<String> handleentitynotfound(EntityNotFoundException ex, WebRequest webRequest) {
    ErrorDetails error = new ErrorDetails(
    LocalDateTime.now(),
            ex.getMessage(),
            webRequest.getDescription(false),
            "USER NOT FOUND"
    );

    return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
}
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleValidationExceptions(ConstraintViolationException ex,WebRequest webRequest) {
        ErrorDetails error = new ErrorDetails(
                LocalDateTime.now(),
                ex.getMessage(),
                webRequest.getDescription(false),
                "USER NOT FOUND"
        );
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
