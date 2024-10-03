package com.Insurance.HealthInsurancePolicy.ExceptionHandler;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timestamp;
   private String message;
   private String path;
   private String errorcode;

    public ErrorDetails() {
    }

    public ErrorDetails(LocalDateTime timestamp, String message, String path, String errorcode) {
        this.timestamp = timestamp;
        this.message = message;
        this.path = path;
        this.errorcode = errorcode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }
}
