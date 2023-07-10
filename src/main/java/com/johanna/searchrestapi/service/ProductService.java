package com.johanna.searchrestapi.service;

import com.johanna.searchrestapi.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
