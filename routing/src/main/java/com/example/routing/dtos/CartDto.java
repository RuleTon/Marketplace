package com.example.routing.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class CartDto {
    private List<com.example.routing.dtos.CartItemDto> items;
    private int totalPrice;
}
