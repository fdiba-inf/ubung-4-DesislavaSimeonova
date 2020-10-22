package exercise4;

<<<<<<< HEAD
import java.util.*;
=======
import Java.util.Scanner;
import Java.util.Arrays;
>>>>>>> origin/master

public class ArrayOutput {
  public static void main (String[] args){

<<<<<<< HEAD
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
=======
    Scanner input = new Scaner(System.in);
        int[] masiv = new int [5];
    System.out.println("Enter numbers: ");
    String space = " ";
    for (int index = 0; index < masiv.length; index++){
      numbers[index] = input.nextInt();
    }

>>>>>>> origin/master
  }
}