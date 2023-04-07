package com.ssc.ProductService.service;

import com.ssc.ProductService.entity.Product;
import com.ssc.ProductService.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public List getAllProduct(){
       return productRepo.findAll();
    }
    public Optional<Product> getProductById(int pid){
        return productRepo.findById(pid);
    }
    public Product saveProduct(Product product){
        return productRepo.save(product);
    }
}
