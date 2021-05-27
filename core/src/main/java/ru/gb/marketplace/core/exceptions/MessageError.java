package ru.gb.marketplace.core.exceptions;

import java.util.Date;

public class MessageError{
    private int status;
    private String message;
    private Date timestamp;

    public MessageError(int status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = new Date();
    }
}
