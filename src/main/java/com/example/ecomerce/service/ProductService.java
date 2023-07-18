package com.example.ecomerce.service;

import com.example.ecomerce.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProductById(Long id);
    public Product getProductByName(String name);
    public Product saveProduct(Product product);
    public Product updateProduct(Product product,Long id);
    public void deleteProductById(Long id);
    public void deleteAllProducts();
    public List<Product> getProductsByName(String category);
}
