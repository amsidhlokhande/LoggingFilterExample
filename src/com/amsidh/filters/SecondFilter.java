package com.amsidh.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondFilter implements Filter {

	private FilterConfig config;

	@Override
	public void destroy() {
		System.out.println("SecondFilter destroy method is called");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		System.out.println("SecondFilter doFilter is called");
		config.getServletContext().setAttribute("secondFilter", " Second Filter adds value in ServletContext");
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("SecondFilter Init method is called");
		this.config = config;
	}

}
