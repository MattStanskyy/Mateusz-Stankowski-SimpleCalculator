package com.kodilla.kodillacoursecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseCalculatorApplication.class, args);

        Calculator calculator = new Calculator();
    int resultOfAdding = calculator.adding(10, 5);
    int resultOfSubtracting = calculator.subtracting(10, 5);
    System.out.println("Result of adding: " + resultOfAdding);
        System.out.println("Result of adding: " + resultOfSubtracting);
    }

}
