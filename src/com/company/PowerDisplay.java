package com.company;

import java.util.Scanner;

public class PowerDisplay {
    public void displayTable(){
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Enter the number you want to display its powers: ");
        int number =getNumber.nextInt();
        System.out.println(number);

        Scanner getRange = new Scanner(System.in);
        System.out.println("Enter the range that you want to calculate the powers of " + number);
        int range = getRange.nextInt();
        System.out.println(range);

        calculatePowers(number,range);
    }

    public void calculatePowers(int number,int range){
        for(; number<=range; number++){
            for(int i = 0;i<=range;i++){
                System.out.println(number + " " + "to the power of " + i + " " + "is: " + Math.pow(number,i));
            }
        }
    }
}
