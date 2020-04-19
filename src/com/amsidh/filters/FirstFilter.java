package com.amsidh.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstFilter implements Filter {

	private FilterConfig config;

	@Override
	public void destroy() {
		System.out.println("FirstFilter destroy method is called");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		System.out.println("FirstFilter doFilter is called");
		request.setAttribute("firstFilter", " First Filter adds value in request");

		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("FirstFilter Init method is called");
		this.config = config;
	}

}
