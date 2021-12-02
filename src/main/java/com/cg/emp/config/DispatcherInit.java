package com.cg.emp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] config = {EmployeeConfig.class};
		return config;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapping = {"/"};
		return mapping;
	}

	
}
