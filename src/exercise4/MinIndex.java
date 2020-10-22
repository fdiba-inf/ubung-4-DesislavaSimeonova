package exercise4;
import java.util.*;
public class MinIndex {
  public static void main (String []args){
    Scanner input = new Scanner(System.in);
  int p = input.nextInt();
  double [] masiv = new double [p];
System.out.println("Napishi chisla:");
double MinElement = Double.MAX_VALUE;
int minindex = 0;
for (int r = 0; r < masiv.length; r++){
  double s = input.nextDouble();
  
  if (s < MinElement){
    MinElement = s;
    minindex = r;
  
  }
}
System.out.println("Min index: " + minindex);
  }
}