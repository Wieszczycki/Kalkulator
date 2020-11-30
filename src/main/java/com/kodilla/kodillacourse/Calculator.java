package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {

    public void someMethod() {

    }

    public static void main(String[] args) {
        //SpringApplication.run(KodillaCourseApplication.class, args);
        Calculator calculator = new Calculator();
        calculator.someMethod();
        System.out.println("Zadziałało.");
    }

}
