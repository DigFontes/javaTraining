package org.training.grosscalculator;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get text
        System.out.printf("%nEnter some text:  ");
        String text = scanner.next();
        scanner.close();

        boolean  letterFound = false;

        //Search text for letter A
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                System.out.printf("%nYou just found it!");
                break;
            } else {
                System.out.printf("%nTry it again!");
            }
        }

        while (letterFound == false) {

        }
    }
}
