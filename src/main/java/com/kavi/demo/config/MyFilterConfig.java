package com.kavi.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kavi.demo.filter.NewFilter;

@Configuration
public class MyFilterConfig {
	@Bean
	public FilterRegistrationBean<NewFilter> registrationBean() {
		FilterRegistrationBean<NewFilter> registrationBean = new FilterRegistrationBean<NewFilter>();
		registrationBean.setFilter(new NewFilter());
		registrationBean.addUrlPatterns("/customers/*");
		return registrationBean;

	}
}
