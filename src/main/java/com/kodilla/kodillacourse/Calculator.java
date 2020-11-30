package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {

    private int a;
    private int b;

    public void Calculator() {

    }

    public int dodaj(int a, int b) {
        this.a = a;
        this.b = b;
        return a + b;
    }

    public int odejmij(int a, int b) {
        this.a = a;
        this.b = b;
        return a - b;
    }

    public static void main(String[] args) {
        //SpringApplication.run(KodillaCourseApplication.class, args);
        //test
        Calculator calculator = new Calculator();
        System.out.println("Dodajemy 3 i 5");
        System.out.println(calculator.dodaj(3, 5));
        System.out.println("Odejmujemy 9 i 3");
        System.out.println(calculator.odejmij(9, 3));
        System.out.println("Zadziałało.");
    }

}
