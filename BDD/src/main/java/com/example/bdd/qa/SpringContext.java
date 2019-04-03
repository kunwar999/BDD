package com.example.bdd.qa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:default.properties")
public class SpringContext {

	@Value("${title}")
	String title;

	@Bean(name = "bddFrame")
	public BddFrame createBddFrame() {
		return new BddFrame(title);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer setUp() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
