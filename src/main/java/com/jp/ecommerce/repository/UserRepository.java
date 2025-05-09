package com.jp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.ecommerce.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
