package org.training.grosscalculator;

import java.util.Scanner;

public class TestResults {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //Get the test score
        System.out.printf("%nEnter your test score: ");
        double score = scanner.nextDouble();
        scanner.close();
        
        //Determine the letter grande
        char grade;

        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.printf("%nYou grade score is: %s%n", score);
    }
}
