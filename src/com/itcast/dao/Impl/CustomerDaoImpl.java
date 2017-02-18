package com.itcast.dao.Impl;

import com.itcast.dao.CustomerDao;
import com.itcast.domain.Customer;
import com.itcast.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.List;

/**
 * Created by Feng on 2017/2/16.
 */
public class CustomerDaoImpl implements CustomerDao {
    @Test
   /* public void findAll1() {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Customer.class);
        List<Customer> list = criteria.list();
        for (Customer customer : list) {
            System.out.println("customer = " + customer);
        }
        transaction.commit();
        //return null;
    }*/
    public List<Customer> findAll() {
        Session currentSession = HibernateUtils.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        Criteria criteria = currentSession.createCriteria(Customer.class);
        List<Customer> list = criteria.list();
        for (Customer customer : list) {
            System.out.println("customer = " + customer);
        }
        transaction.commit();
        return list;
    }

    @Override
    public void add(Customer customer) {
        Session currentSession = HibernateUtils.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.save(customer);
        transaction.commit();
    }
}
