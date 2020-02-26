package com.projekt.pakowanie.pakowanie.wyjatki;

import java.time.LocalDateTime;

class podstawowewyjatki {
    private LocalDateTime timestamp;
    private String message;
    private String details;
 public podstawowewyjatki() {
    }

    public podstawowewyjatki(LocalDateTime timestamp, String message, String details) {
        this.message = message;
        this.details = details;
        this.timestamp=timestamp;
    }

    public LocalDateTime getTimestamp() {
        return timestamp=timestamp;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}





