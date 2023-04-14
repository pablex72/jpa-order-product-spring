package com.pabdev.jpaini.repository;

import com.pabdev.jpaini.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
