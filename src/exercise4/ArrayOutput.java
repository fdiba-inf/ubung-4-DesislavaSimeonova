package exercise4;

import java.util.*;

public class ArrayOutput {
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);
      int d = input.nextInt();
        int[] masiv = new int[d];
        
    System.out.println("Enter numbers: ");
    String space = "";
    for (int index = 0; index < masiv.length; index++){
      masiv[index] = input.nextInt();
      
    }
    for (int index = 0; index < masiv.length; index++){
     
     System.out.println(space + masiv[index]);
     space = space + " ";
    }
  }
}