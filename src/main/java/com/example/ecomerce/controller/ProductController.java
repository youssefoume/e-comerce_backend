package com.example.ecomerce.controller;

import com.example.ecomerce.entity.Product;
import com.example.ecomerce.service.impl.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
        public List<Product> getProducts(){
            return productService.getAllProducts();
        }
        @GetMapping("/product/{name}")
        public Product getProductByName(@PathVariable String name){
            return productService.getProductByName(name);
        }
    @GetMapping("/product/{id}")
    public Product getProductByName(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @PostMapping("/product/save")
    public Product saveProduct(@RequestBody  Product product){
        return productService.saveProduct(product);
    }
    @PutMapping("/product/update/{id}")
    public Product updateProduct(@RequestBody  Product product,@PathVariable Long id){
        return productService.updateProduct(product,id);
    }
    @DeleteMapping("/product/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProductById(id);
    }
    @DeleteMapping("/product/deleteAll")
    public void deleteAllProducts(){
        productService.deleteAllProducts();
    }
    @GetMapping("/products/{name}")
    public List<Product> getProductsByCategory(@PathVariable String name){
        return productService.getProductsByName(name);
    }
}
