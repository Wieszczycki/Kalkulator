package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania.");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieszczę kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        int add1 = calculator.add(10 ,7);
        System.out.println("test dodawania 10 + 7");
        if (add1 == 17) {
            System.out.println("Wynik poprawny = 17");
        } else {
            System.out.println("Błąd dodawania.");
        }
        int sub1 = calculator.substract(10 ,7);
        System.out.println("test odejmowania 10 - 7");
        if (sub1 == 3) {
            System.out.println("Wynik poprawny = 3");
        } else {
            System.out.println("Błąd odejmowania.");
        }
    }
}
