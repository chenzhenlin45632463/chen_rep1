package com.java.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("*.html")
public class FileterDemo3 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("进入demo3");

        /*放行*/
        chain.doFilter(request,response);

        System.out.println("离开demo3");
    }

    @Override
    public void destroy() {

    }
}
