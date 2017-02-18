package com.itcast.servlet.impl;

import com.itcast.dao.CustomerDao;
import com.itcast.dao.Impl.CustomerDaoImpl;
import com.itcast.domain.Customer;
import com.itcast.servlet.CustomerServlet;

import java.util.List;

/**
 * Created by Feng on 2017/2/16.
 */
public class CustomerServletImpl implements CustomerServlet {
    @Override
    public List<Customer> findAll() {
        CustomerDao customerDao = new CustomerDaoImpl();
        return customerDao.findAll();
    }

    @Override
    public void add(Customer customer) {
        CustomerDao customerDao = new CustomerDaoImpl();
        customerDao.add(customer);
    }
}
