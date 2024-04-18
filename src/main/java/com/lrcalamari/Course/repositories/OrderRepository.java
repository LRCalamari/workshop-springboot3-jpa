package com.lrcalamari.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lrcalamari.Course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}