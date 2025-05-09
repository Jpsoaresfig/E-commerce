package com.jp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.ecommerce.Entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
