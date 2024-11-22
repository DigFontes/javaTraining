package org.training.grosscalculator;

import java.util.Random;
import java.util.Scanner;

public class RollDieGame {

    public static String playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;

        String tooLow = "You're on space %d. Sorry, you lose!";
        String tooHigh = "You've exceeded %d spaces. Sorry, you lose!";
        String justRight = "You're on space %d. Congrats, you win!";

        for(int i=0;i<maxRolls; i++) {
            int die = random.nextInt(6) +1;
            currentSpace = scanner.nextInt();
            currentSpace = currentSpace +die;

            if(currentSpace == lastSpace) {
                return String.format(justRight, currentSpace);
            } else if (currentSpace > lastSpace) {
                return String.format(tooHigh, currentSpace);
            } else if (i==maxRolls && currentSpace < lastSpace) {
                return String.format(tooLow, currentSpace);
            }
        }

        return "You've exceeded you rolls! Sorry, try again!";
    }
}
