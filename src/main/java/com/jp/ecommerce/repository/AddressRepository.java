package com.jp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.ecommerce.Entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {}