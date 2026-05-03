package com.devops;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("=========================================");
        System.out.println("     DEVOPS CI/CD PIPELINE DEMO");
        System.out.println("=========================================");
        System.out.println();
        
        System.out.println("Calculator Results:");
        System.out.println("-------------------");
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
        System.out.println("10 * 5 = " + calc.multiply(10, 5));
        System.out.println("10 / 5 = " + calc.divide(10, 5));
        
        System.out.println();
        System.out.println("=========================================");
        System.out.println("     APPLICATION RUNNING SUCCESSFULLY");
        System.out.println("=========================================");
    }
}