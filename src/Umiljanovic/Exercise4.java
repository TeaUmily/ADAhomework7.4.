package Umiljanovic;
import java.util.Date;

//4. Write a program that prints the next 20 leap years.
public class Exercise4 {
    public static void main(String[] args) {

        System.out.println("The next 20 leap years:");
        int previously_year= 2016;
        for (int i=0; i<20 ; i++){
            previously_year+=4;
            System.out.println(previously_year+".");

        }


    }
}
