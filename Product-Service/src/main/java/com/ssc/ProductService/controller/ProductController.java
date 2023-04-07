package com.ssc.ProductService.controller;

import com.ssc.ProductService.entity.Product;
import com.ssc.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }
    @PostMapping("/")
    public Product saveProducts(@RequestBody  Product product){
        return productService.saveProduct(product);
    }
    @GetMapping("{id}")
    public Optional<Product> getProductById(@PathVariable("id") int pid){
        return productService.getProductById(pid);
    }
}
