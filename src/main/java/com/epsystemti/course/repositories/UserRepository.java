package com.epsystemti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epsystemti.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
