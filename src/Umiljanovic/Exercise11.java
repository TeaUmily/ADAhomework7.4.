package Umiljanovic;


import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {


        Scanner in= new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int array[][]= new int[x][y];
        int n=x*y;
        int a=x-1;
        int b=y-1;
        int k=0;
do {

    if(n==1){
        array[a][b]=n;
        break;
    }

    for (int j = b; j > k; j--) {
        array[a][j] = n;
        n--;
    }

    for (int i = a; i > k; i--) {
        array[i][k] = n;
        n--;
    }

    for (int j = k; j < b; j++) {
        array[k][j] = n;
        n--;
    }

    for (int i = k; i < a; i++) {
        array[i][b] = n;
        n--;
    }

    a=a-1;
    b=b-1;
    k=k+1;

}while (n>0);



        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                System.out.print(array[i][j]+" ");

            }
            System.out.print("\n");

        }


    }




}
