package org.training.grosscalculator;

import java.util.Scanner;

public class GrossPayInputValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialize known variables
        int payRate = 15;
        int maxHours = 40;

        //Get input for unkown variables
        System.out.printf("%nHow many hours did the employee work this week? ");
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while (hoursWorked > maxHours) {
            System.out.printf("%nInvalid entry. Your hours must be between 1 and 40. Try again.%n");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //Calculate gross
        double gross = payRate + hoursWorked;
        System.out.printf("%nGross pay: $%s%n", gross);
    }
}
