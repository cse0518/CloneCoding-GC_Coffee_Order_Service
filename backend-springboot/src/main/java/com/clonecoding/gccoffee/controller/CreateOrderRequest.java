package com.clonecoding.gccoffee.controller;

import com.clonecoding.gccoffee.model.OrderItem;

import java.util.List;

public record CreateOrderRequest(
  String email, String address, String postcode, List<OrderItem> orderItems
) {
}
