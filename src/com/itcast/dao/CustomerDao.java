package com.itcast.dao;

import com.itcast.domain.Customer;

import java.util.List;

/**
 * Created by Feng on 2017/2/16.
 */
public interface CustomerDao {

    List<Customer> findAll();

    void add(Customer customer);
}
