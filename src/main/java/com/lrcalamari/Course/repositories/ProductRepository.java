package com.lrcalamari.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lrcalamari.Course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}