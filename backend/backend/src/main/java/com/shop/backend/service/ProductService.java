package com.shop.backend.service;

import com.shop.backend.model.Product;
import com.shop.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private ProductRepository repository;

    // ---------------------------
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    // --------------------------
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
    // ----------------------------

}
