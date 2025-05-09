package com.jp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.ecommerce.Entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
