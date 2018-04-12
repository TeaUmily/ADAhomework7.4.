package Umiljanovic;
//9. Write a program that prints Matrix code lookalike in console.


import java.util.Random;

public class Exercise9 {

    public static void main(String[] args) {

        Random generator= new Random();
        char line[]= new char[120];
        String code= "A B C D E F G H I J K L M N O P R S T U V Z X Y" +
                "                                                     "+
                "                                                      ";
        for(;;){

            for (int i=0; i<120; i++){

                if(generator.nextInt(50)%2==0){
                    line[i]=' ';

                }
                else{
                line[i] = code.charAt(generator.nextInt(code.length()));}
            }

            System.out.println(line);
            try {
                Thread.sleep(100);
            } catch (Exception e) {}


        }



        }

    }
