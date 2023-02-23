package com.kxsilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kxsilva.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
