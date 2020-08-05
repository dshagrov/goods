package com.iqoption.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void test(){
        Product product = new Product();
        Book book = new Book("test", 1, 1, "Petya", 1);
    }

}