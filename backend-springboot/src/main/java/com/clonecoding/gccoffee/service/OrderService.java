package com.clonecoding.gccoffee.service;

import com.clonecoding.gccoffee.model.Email;
import com.clonecoding.gccoffee.model.Order;
import com.clonecoding.gccoffee.model.OrderItem;

import java.util.List;

public interface OrderService {
  Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems);
}
