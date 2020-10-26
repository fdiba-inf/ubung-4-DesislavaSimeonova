package exercise4;
import java.util.*;
public class ArrayReversal {
  public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    int j = input.nextInt();
    char[]masiv = new char [j];
    char[]masiv2=new char[j];
    int counter = j - 1;
    System.out.println("Bukvichkiii");
    for (int i = 0; i < masiv.length; i++){
      masiv[i] = input.next().charAt(0);
      masiv2[counter] = masiv[i];
      counter--;
           }
           String masiv2AsString = Arrays.toString(masiv2);
           System.out.println("Reversed symbols: "+ masiv2AsString);
}
}
