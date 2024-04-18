package com.lrcalamari.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lrcalamari.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}