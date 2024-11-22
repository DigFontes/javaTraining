package org.training.grosscalculator;

import java.util.Scanner;

public class Geetings {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        geetUser();
    }

    public static void geetUser() {
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hi there, " + name);
    }
}
