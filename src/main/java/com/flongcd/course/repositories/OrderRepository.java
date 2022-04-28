package com.flongcd.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flongcd.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
