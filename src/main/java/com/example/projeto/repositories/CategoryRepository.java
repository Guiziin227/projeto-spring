package com.example.projeto.repositories;

import com.example.projeto.entities.Category;
import com.example.projeto.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
