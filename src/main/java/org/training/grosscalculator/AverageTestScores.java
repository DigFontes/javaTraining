package org.training.grosscalculator;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        //Process all students
        for (int i = 0; i < numberOfStudents; i++) {

            double total = 0;

            //Process a student's test scores
            for (int j = 0; j < numberOfTests; j++) {
                System.out.printf("%nEnter the score for Test #%s  ", (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTests;
            System.out.printf("%nThe test average for student #%s is %s.", (i+1), average);

        }



        scanner.close();

    }
}
