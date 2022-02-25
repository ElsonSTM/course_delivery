package com.epsystemti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epsystemti.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
