package Umiljanovic;

import java.util.Scanner;

//1. Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
public class Exercise1 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int number;
        int sum=0;
        do {
            number = in.nextInt();
        } while (number < 0);

        for (int i = 0; i <= number; i++){
            sum= sum+i;
        }

        System.out.println("The sum of the numbers 1 to "+number+" is " +sum);
    }

    }




