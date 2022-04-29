package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@ComponentScan(basePackages = "com.calculator")
public class BalanceSheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalanceSheetApplication.class, args);
	}

	@Bean
	public ViewResolver internalViewResolver() {
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/Web-Inf/view/");
		view.setSuffix(".jsp");
		return view;
	}
}
