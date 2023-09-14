package com.example.BooksShop.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private String title;
    private Double price;
    private Long categoryId;
}
