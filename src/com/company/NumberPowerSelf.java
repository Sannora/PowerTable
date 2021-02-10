package com.company;

import java.util.Scanner;

public class NumberPowerSelf {
    public void displayNumberPowerSelf(){
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Enter the number you want to display its powers: ");
        int number =getNumber.nextInt();
        System.out.println(number);

        Scanner getRange = new Scanner(System.in);
        System.out.println("Enter the range that you want to calculate the powers of " + number);
        int range = getRange.nextInt();
        System.out.println(range);

        calculateSelfPower(number,range);
    }

    public void calculateSelfPower(int number, int range){
        for(int i = 0; i <= range; i++){
            for(;number<=range;number++){
                System.out.println(number + " to the power of " + number + " is: " + Math.pow(number,number));
            }
        }
    }
}
