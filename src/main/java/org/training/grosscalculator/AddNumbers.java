package org.training.grosscalculator;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int runAgain = 0;

        do {
            System.out.printf("%nEnter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.printf("%nEnter the second number: ");
            double number2 = scanner.nextDouble();

            double sum = number1 + number1;
            System.out.printf("%nThe sum is: %s%n", sum);

            System.out.printf("%nWould you like to start over? Enter 1 for yes, 2 for no.%n");
            runAgain = scanner.nextInt();

        } while (runAgain == 1);

        scanner.close();
    }
}
