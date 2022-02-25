package com.epsystemti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epsystemti.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
