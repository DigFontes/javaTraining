package org.training.grosscalculator;

import java.util.Scanner;

public class QuotaChecker {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Initialize known values
        int quota = 10;

        //Get values for the unknown
        System.out.printf("%nHow many sales did you make this week? ");
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > quota){
            System.out.printf("%nCongrats! You've met your quota.");
        } else {
            int salesShort = quota - sales;
            System.out.printf("%nYou did not make your quota. You were %s sales short.%n", salesShort);
        }
    }


}
