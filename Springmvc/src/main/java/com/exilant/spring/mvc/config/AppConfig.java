package com.exilant.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class AppConfig {
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/views/");
		view.setSuffix(".jsp");
		view.setViewClass(JstlView.class);
		return view;	
	}
	
	
}
