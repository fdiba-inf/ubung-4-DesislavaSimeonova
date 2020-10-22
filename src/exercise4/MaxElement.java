package exercise4;
import java.util.*;
public class MaxElement {
public static void main (String[]args){
  Scanner input = new Scanner(System.in);
  int p = input.nextInt();
  double [] masiv = new double [p];
System.out.println("Napishi chisla:");
double MaxElement = Double.MIN_VALUE;
for (int r = 0; r < masiv.length; r++){
  double s = input.nextDouble();
  
  if (s > MaxElement){
    MaxElement = s;
  }
}
System.out.println("Max number: " +MaxElement);
}
}