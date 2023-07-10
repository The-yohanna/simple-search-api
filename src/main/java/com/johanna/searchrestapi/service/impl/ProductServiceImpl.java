package com.johanna.searchrestapi.service.impl;

import com.johanna.searchrestapi.model.Product;
import com.johanna.searchrestapi.repository.ProductRepository;
import com.johanna.searchrestapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProducts(query);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

}
