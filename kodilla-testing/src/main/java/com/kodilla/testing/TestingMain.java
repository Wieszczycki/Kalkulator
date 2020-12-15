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

        Calculator testCalcAdd = new Calculator();
        System.out.println("test dodawania 10 + 7");
        System.out.println(testCalcAdd.add(10, 7));
        Calculator testCalcSub = new Calculator();
        System.out.println("test odejmowania 10 - 7");
        System.out.println(testCalcAdd.substract(10, 7));
    }
}
