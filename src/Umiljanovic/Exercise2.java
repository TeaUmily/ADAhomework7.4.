package Umiljanovic;
import java.util.Scanner;
//2. Write a program that asks the user for a number n and gives them the
// possibility to choose between computing the sum and computing the product of 1,…,n.

public class Exercise2 {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int calculateProduct(int n) {

        int product = 1;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        return product;
    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number;
        do{
         number = in.nextInt();
        }
        while(number<0);


        System.out.println("Would you like to calculate the sum or the product of 1,...,n? (type sum or product)");
        String operation;

        operation = in.next();



        switch (operation) {
            case ("sum"): {
                System.out.println("The sum of the numbers 1 to "+number+" is " + calculateSum(number));
                break;
            }
            case ("product"): {
                System.out.println("The product of the numbers 1 to "+number+" is " + calculateProduct(number));
                break;


            }


                }

            }


    }

