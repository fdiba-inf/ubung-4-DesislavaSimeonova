package exercise4;

import java.util.*;

public class ArrayInput {
  public static void main (String[] args) {
    
  Scanner input = new Scanner(System.in);

   int chislo = input.nextInt();
   int[] array = new int[chislo];
   
   for (int d = 0; d < array.length; d++){
     array[d]=input.nextInt();
   }

  String numbersAString = Arrays.toString(array);
   System.out.println("Numbers: " + numbersAString);

}
}