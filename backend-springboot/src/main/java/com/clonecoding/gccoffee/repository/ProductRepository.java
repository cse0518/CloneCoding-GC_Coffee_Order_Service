package com.clonecoding.gccoffee.repository;

import com.clonecoding.gccoffee.model.Category;
import com.clonecoding.gccoffee.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {

  List<Product> findAll();

  Product insert(Product product);

  Product update(Product product);

  Optional<Product> findById(UUID productId);

  Optional<Product> findByName(String productName);

  List<Product> findByCategory(Category category);

  void deleteAll();

}
