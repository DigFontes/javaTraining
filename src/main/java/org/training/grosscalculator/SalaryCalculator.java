package org.training.grosscalculator;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unkown
        System.out.printf("%nHow many sales did the employee make this week? ");
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earnes
        if(sales > quota){
            salary = salary + bonus;
        }


        //Output
        System.out.printf("%nThe employee's pay is $%s%n", salary);
    }
}
