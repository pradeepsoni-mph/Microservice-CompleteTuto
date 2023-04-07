package com.ssc.CustomerService.classes;

import com.ssc.CustomerService.entitry.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyOrders {
    Customer customer;
    Product product;
}
