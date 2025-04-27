package com.example.projeto.repositories;

import com.example.projeto.entities.Category;
import com.example.projeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
