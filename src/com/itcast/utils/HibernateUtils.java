package com.itcast.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Feng on 2017/2/16.
 */
public class HibernateUtils {
    private static final Configuration CONFIGURATION;
    private static final SessionFactory SESSION_FACTORY;

    static {
        CONFIGURATION = new Configuration().configure();
        SESSION_FACTORY = CONFIGURATION.buildSessionFactory();
    }

    public static Session getCurrentSession() {
        return SESSION_FACTORY.getCurrentSession();
    }
}
