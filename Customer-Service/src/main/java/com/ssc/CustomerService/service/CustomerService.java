package com.ssc.CustomerService.service;

import com.ssc.CustomerService.classes.MyOrders;
import com.ssc.CustomerService.classes.Product;
import com.ssc.CustomerService.entitry.Customer;
import com.ssc.CustomerService.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    RestTemplate restTemplate;

    public Customer saveCustome(Customer customer){
        return customerRepo.save(customer);
    }
    public MyOrders getMyOrders(int customerId){
        Optional<Customer> customer =customerRepo.findById(customerId);
        int pid=customer.get().getPid();
        Product product=restTemplate.getForObject("http://PRODUCT-SERVICE/product/"+ pid,Product.class);
                //restTemplate.getForObject("http://localhost:8001/product/"+ pid,Product.class);
        MyOrders myOrders=new MyOrders();
        myOrders.setCustomer(customer.get());
        myOrders.setProduct(product);
        return myOrders;
    }
}
