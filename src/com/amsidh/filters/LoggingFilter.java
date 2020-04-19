package com.amsidh.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoggingFilter implements Filter {

	private FilterConfig filterConfig;

	@Override
	public void destroy() {
		System.out.println("LoggingFilter destroy method");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		System.out.println("LoggingFilter doFilter method");
    
		//log user IP Address
		filterConfig.getServletContext().log(request.getRemoteHost());
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("LoggingFilter init method");
		this.filterConfig = filterConfig;

	}

}
