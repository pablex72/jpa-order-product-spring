package com.pabdev.jpaini.controller;

import com.pabdev.jpaini.dto.OrderRequest;
import com.pabdev.jpaini.entity.Customer;
import com.pabdev.jpaini.repository.CustomerRepository;
import com.pabdev.jpaini.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }
}
