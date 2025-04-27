package com.example.projeto.repositories;

import com.example.projeto.entities.OrderItem;
import com.example.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
