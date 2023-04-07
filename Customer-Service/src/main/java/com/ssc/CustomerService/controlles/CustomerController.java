package com.ssc.CustomerService.controlles;

import com.ssc.CustomerService.classes.MyOrders;
import com.ssc.CustomerService.entitry.Customer;
import com.ssc.CustomerService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustome(customer);
    }
    @GetMapping("/{cid}")
    public MyOrders getMyOrders(@PathVariable("cid") int customerId){
        return customerService.getMyOrders(customerId);
    }
}
