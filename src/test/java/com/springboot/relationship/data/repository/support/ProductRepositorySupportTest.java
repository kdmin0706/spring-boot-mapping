package com.springboot.relationship.data.repository.support;

import com.springboot.advanced_jpa.data.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductRepositorySupportTest {

    @Autowired
    ProductRepositorySupport productRepositorySupport;

    @Test
    void findByNameTest() {
        List<Product> productList = productRepositorySupport.findByName("pen");

        for (Product product : productList) {
            System.out.println(product.getNumber());
            System.out.println(product.getName());
            System.out.println(product.getPrice());
            System.out.println(product.getStock());
        }
    }
}