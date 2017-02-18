package com.itcast.utils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by Feng on 2017/2/17.
 */
@WebFilter(filterName = "LoadSessionFactoryFilter")
public class LoadSessionFactoryFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        Class<?> clazz = null;
        try {
            clazz = Class.forName("com.itcast.utils.HibernateUtils");
            System.out.println("SessionFactory初始化成功!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
