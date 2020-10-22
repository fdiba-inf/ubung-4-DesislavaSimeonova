package exercise4;

<<<<<<< HEAD
import java.util.*;
=======
import Java.util.Arrays;
import Java.util.Scanner;
>>>>>>> origin/master

public class ArrayInput {
  public static void main (String[] args) {
    
  Scanner input = new Scanner(System.in);

   int chislo = input.nextInt();
<<<<<<< HEAD
   int[] array = new int[chislo];
   
   for (int d = 0; d < array.length; d++){
     array[d]=input.nextInt();
   }

  String numbersAString = Arrays.toString(array);
   System.out.println("Numbers: " + numbersAString);
=======
   int[] arra0y = new int[chislo];
   
   for (int d = 0; d < array.length; d++){
     array[d]=input.nextInt;
   }

  String numbersAsString = Arrays.toString(array);
   System.out.println("Numbers: " + arrayAsString);
>>>>>>> origin/master

}
}