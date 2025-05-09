package com.jp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.ecommerce.Entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{
	
}
