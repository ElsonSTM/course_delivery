package com.epsystemti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epsystemti.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
