package com.lrcalamari.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lrcalamari.Course.entities.OrderItem;
import com.lrcalamari.Course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}