package org.training.grosscalculator;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get number of items to scan
        System.out.printf("%nEnter the number of items you would you like to scan: ");

        int quantity  = scanner.nextInt();

        double total = 0;

        //Create loop to iterate through all the items and accumulate the costs
        for(int i=0; i < quantity; i++) {
            System.out.printf("%nEnter the cost of the item: ");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();
        System.out.printf("%nThe total ammount is: $%s%n", total);

    }
}
