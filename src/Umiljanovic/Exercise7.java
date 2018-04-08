package Umiljanovic;

//7. Write a method that returns the elements on odd positions in a array

public class Exercise7 {
    public static void main(String[] args) {

        double array[]= new double[]{0,1,2,3,4,5,6,7,8};

        printArray(array);



        double newArray[]= oddPositionsElements(array);
        System.out.println("\nnew array:");
         printArray(newArray);

    }

    public static void printArray(double array[]){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static double[] oddPositionsElements(double array[]) {

        int numberOfOddElements = array.length / 2;
        double newArray[] = new double[numberOfOddElements];

            int i=1;

            for (int j = 0; j < newArray.length; j++) {

                newArray[j] = array[i];
                 i+=2;
            }

        return newArray;
    }



}
