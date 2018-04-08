package Umiljanovic;
//3. Write a program that prints a multiplication table for numbers up to 12.

public class Exercise3 {
    public static void main(String[] args) {

        int multi_table[][]= new int[12][12];

        for (int i=0; i<12; i++){
            multi_table[i][0]=i;
            multi_table[0][i]=i;
        }



        for (int i=1; i<12; i++){
            for (int j=1; j<12; j++){
                multi_table[i][j]= multi_table[0][j]*multi_table[i][0];

            }
        }


        for (int i=0; i<12; i++){
            for (int j=0; j<12; j++){
                System.out.print(multi_table[i][j]+" ");
            }
            System.out.println("\n");
        }

    }


}
