package org.training.grosscalculator;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("%nEnter your letter grade: ");
        String grade = scanner.next();
        scanner.close();

        String message;
        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bir harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        System.out.printf("%n%s%n", message);

//        String message = switch (grade) {
//            case "A" -> "Excellent job!";
//            case "B" -> "Great job!";
//            case "C" -> "Good job!";
//            case "D" -> "You need to work a bir harder";
//            case "F" -> "Uh oh!";
//            default -> "Error. Invalid grade";
//        };

    }
}
