package com.flongcd.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flongcd.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
