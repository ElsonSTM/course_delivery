package com.epsystemti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epsystemti.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
