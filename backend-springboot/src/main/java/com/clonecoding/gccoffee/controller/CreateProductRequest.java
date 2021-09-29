package com.clonecoding.gccoffee.controller;

import com.clonecoding.gccoffee.model.Category;

public record CreateProductRequest(String productName, Category category, long price, String description) {
}
