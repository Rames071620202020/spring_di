package com.rab3.io.spring_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BeanConfiguration {
	@Bean
	public School school() {
		return new School();
	}

}