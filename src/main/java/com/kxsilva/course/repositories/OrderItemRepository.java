package com.kxsilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kxsilva.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
