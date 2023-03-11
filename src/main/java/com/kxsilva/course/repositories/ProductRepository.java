package com.kxsilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kxsilva.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
