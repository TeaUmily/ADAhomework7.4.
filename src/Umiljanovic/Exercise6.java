package Umiljanovic;
//6. Write a method that reverses a array.

public class Exercise6 {
    public static void main(String[] args) {

        double array[]= new double[]{0,1,2,3,4,5,6,7};

        System.out.println("array: ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+", ");
        }
        reverseArray(array);

        System.out.println("\nreversed array: ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+", ");
        }


    }



    public static void reverseArray(double array[]){

        double temp;
        int j=array.length-1;

        for(int i=0; i<array.length/2; i++){

                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                j--;

        }

    }

}
