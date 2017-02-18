package com.itcast.action;

import com.itcast.domain.Customer;
import com.itcast.servlet.CustomerServlet;
import com.itcast.servlet.impl.CustomerServletImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Feng on 2017/2/16.
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    public String findAll() {
        CustomerServlet customerServlet = new CustomerServletImpl();
        List<Customer> list = customerServlet.findAll();

        for (Customer customer : list) {
            System.out.println("customer = " + customer);
        }
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("list", list);
        return "list";
    }

    Customer customer = new Customer();

    @Override
    public Customer getModel() {
        return customer;
    }

    public String add() {
        CustomerServlet customerServlet = new CustomerServletImpl();
        customerServlet.add(customer);
        return "add";
    }
}
