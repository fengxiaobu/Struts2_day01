package com.itcast.servlet;

import com.itcast.domain.Customer;

import java.util.List;

/**
 * Created by Feng on 2017/2/16.
 */
public interface CustomerServlet {
    List<Customer> findAll();

    void add(Customer customer);
}
