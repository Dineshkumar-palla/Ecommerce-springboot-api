package com.ecommerce.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    // Get all products
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    // Get product by id
    public Product getProductById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Create product
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    // Update product
    public Product updateProduct(Long id, Product product) {
        Product existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(product.getName());
            existing.setDescription(product.getDescription());
            existing.setPrice(product.getPrice());
            existing.setStock(product.getStock());
            return repository.save(existing);
        }

        return null;
    }

    // Delete product
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}