package com.example.taxcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class
})
public class TaxCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxCalculatorApplication.class, args);
	}

}
