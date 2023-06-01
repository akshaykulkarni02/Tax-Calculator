package com.akshay.javaapp.taxcalculator;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        System.out.println("Tax Calculator App \n-----WELCOME-----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total person count: ");
        int personCount = scanner.nextInt();

        System.out.println();

        String [] names = new String[personCount];
        long []  income = new long[personCount];

        for (int i = 0; i < personCount; i++) {
            System.out.println("Enter the name" + (i+1) + ": ");
            names[i] = scanner.next();
            System.out.println("Enter " + names[i] + "'s Annual Income: " );
            income[i] =scanner.nextLong();
            System.out.println();
        }
        scanner.close();
        System.out.println("Names with liable taxes");
        System.out.println("-----------------------");

        for (int i =0 ; i < personCount ; i++) {
            calculateTax(names[i], income[i]);
        }

    }
    private static void calculateTax(String name, long income) {
        long tax = 0L;

        if (income <= 300000) {
            tax = 0;
        }
        else if (income > 300001 && income <= 600000) {
            tax = income * 5/100;

        }
        else if (income < 600001 && income <= 900000) {
            tax = income * 10/100;
        }
        else if (income < 900001 && income <= 1200000) {
            tax = income * 15/100;
        }
        else if (income > 1200001 && income < 1500000) {
            tax = income*20/100;

        }
        else if (income >= 1500000) {
            tax = income * 30/100;
        }
        System.out.println("Hello " + name + "\n" +
                            "Your Annual Income is: " + income+ "\u20B9"+ " " + "\n" +
                            "Your are liable to pay: " + '\u20B9'+" "+ tax + " tax");

    }
}

