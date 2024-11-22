package org.training.grosscalculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

       //1. Get the number of hours worked
        int hours = 0;
        System.out.printf("%nHow many hours did you work? ");
        hours = scanner.nextInt();

       //2. Get the hourly pay rate
        double payRate = 0;
        System.out.printf("%nWhat is yout pay rate? ");
        payRate = scanner.nextDouble();
        scanner.close();

       //3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        System.out.printf("%nGross pay: %s %n", grossPay);

       //4. Display result
    }
}
