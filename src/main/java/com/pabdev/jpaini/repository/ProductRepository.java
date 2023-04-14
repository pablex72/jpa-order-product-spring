package com.pabdev.jpaini.repository;

import com.pabdev.jpaini.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
