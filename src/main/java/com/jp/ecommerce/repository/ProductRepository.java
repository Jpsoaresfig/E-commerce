package com.jp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.ecommerce.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}