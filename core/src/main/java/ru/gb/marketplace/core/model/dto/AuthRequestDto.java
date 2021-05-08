package ru.gb.marketplace.core.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class AuthRequestDto {

    private String login;
    private String password;
}
