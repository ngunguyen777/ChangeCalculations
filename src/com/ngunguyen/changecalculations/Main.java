package com.ngunguyen.changecalculations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        Double input = scanner.nextDouble();
        input = input * 100;
        Integer change = input.intValue();

        getChange(change);
    }

    private static void getChange(Integer change) {
        Integer[] money = {10_000, 5_000, 2_000, 1_000, 500, 100, 25, 10, 5, 1};
        Integer[] moneyCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i = 0;

        while(i < money.length){
            if(money[i] <= change){
                moneyCount[i]++;
                change -= money[i];
                continue;
            }
            i++;
        }
        System.out.println("Hundred Dollar: " + moneyCount[0]);
        System.out.println("Fifty Dollar: " + moneyCount[1]);
        System.out.println("Twenty Dollar: " + moneyCount[2]);
        System.out.println("Ten Dollar: " + moneyCount[3]);
        System.out.println("Five Dollar: " + moneyCount[4]);
        System.out.println("One Dollar: " + moneyCount[5]);
        System.out.println("Quarters: " + moneyCount[6]);
        System.out.println("Dimes: " + moneyCount[7]);
        System.out.println("Nickles: " + moneyCount[8]);
        System.out.println("Pennies: " + moneyCount[9]);
    }


}
