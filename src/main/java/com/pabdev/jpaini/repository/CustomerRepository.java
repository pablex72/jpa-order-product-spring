package com.pabdev.jpaini.repository;

import com.pabdev.jpaini.dto.OrderResponse;
import com.pabdev.jpaini.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.pabdev.jpaini.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
