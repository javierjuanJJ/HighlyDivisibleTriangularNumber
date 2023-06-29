package org.example;

import org.example.HighlyDivisibleTriangularNumber.HighlyDivisibleTriangularNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int firstDivisibleNumber = HighlyDivisibleTriangularNumber.firstDivisibleNumber(100);
        System.out.println(firstDivisibleNumber);
    }
}