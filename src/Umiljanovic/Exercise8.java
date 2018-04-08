package Umiljanovic;

//8. Write a method that takes a int number and returns a array of its digits.

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        int n= in.nextInt();

        int digitArray[]= numberDigits(n);

        for(int i=0; i<digitArray.length; i++){
            System.out.print(digitArray[i]+" ");

        }
    }

    public static int[] numberDigits(int n) {

        int counter = 0;
        int temp = n;

        do {
            temp = temp / 10;
            counter++;
        } while (temp > 1);

        int digitArray[] = new int[counter];
        for (int i = counter-1; i >=0; i--) {

            digitArray[i] = n % 10;
            n = n / 10;
        }
    return digitArray;
    }
}
