package com.calculator.calculate;
import org.springframework.stereotype.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculateApplication.class, args);
	}

	@Service
    public class Calculator {
      public int sum(int a, int b) {
          return a + b;
     }
	 }
}
