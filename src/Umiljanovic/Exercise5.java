package Umiljanovic;

//5. Write a method that returns the largest element in a array.

public class Exercise5 {
    public static void main(String[] args) {

        double array[]= new double[] {1,2,3,4,5,3,2,7,8,9,125,33};
        System.out.println("Max element in array:" +maxInArray(array));
    }



    public static double maxInArray(double array[]){
      double max=array[0];

      for (int i=1; i<array.length; i++){

          if(max<array[i]){
              max= array[i];
          }
      }

      return max;
    }



}
