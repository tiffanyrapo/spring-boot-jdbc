package com.tist.filter;

import javax.servlet.*;
import java.io.IOException;

public class SimpleFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("request");
    }
}
