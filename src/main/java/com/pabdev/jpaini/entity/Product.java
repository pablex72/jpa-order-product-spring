package com.pabdev.jpaini.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {
    @Id
    private int pid;
    private String productName;
    private int qty;
    private int price;
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk",referencedColumnName = "id")   //cp=customerproduct
    private List<Product> products;

}
