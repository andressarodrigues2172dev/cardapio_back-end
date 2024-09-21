package com.example.cardapio.dto;

import jakarta.persistence.criteria.CriteriaBuilder;

public record FoodRequestDTO(String title, String image, Integer price) {
}
