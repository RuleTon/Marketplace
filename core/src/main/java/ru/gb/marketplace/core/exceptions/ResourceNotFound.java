package ru.gb.marketplace.core.exceptions;

public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound (String message) {
        super(message);
    }
}
