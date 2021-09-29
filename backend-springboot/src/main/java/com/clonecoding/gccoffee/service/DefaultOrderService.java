package com.clonecoding.gccoffee.service;

import com.clonecoding.gccoffee.model.Email;
import com.clonecoding.gccoffee.model.Order;
import com.clonecoding.gccoffee.model.OrderStatus;
import com.clonecoding.gccoffee.model.OrderItem;
import com.clonecoding.gccoffee.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class DefaultOrderService implements OrderService {

  private final OrderRepository orderRepository;

  public DefaultOrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  @Override
  public Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems) {
    Order order = new Order(
      UUID.randomUUID(),
      email,
      address,
      postcode,
      orderItems,
      OrderStatus.ACCEPTED,
      LocalDateTime.now(),
      LocalDateTime.now());
    return orderRepository.insert(order);
  }

}
