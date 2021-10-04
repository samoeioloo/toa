import java.io.*;
import java.util.*;

public class euclidGCD{

  public static int gcd(int m, int n){
    if(n==0){ return m;}

    return gcd(n, m%n);
  }

  public static void main(String[] args){

    System.out.println("Please enter the first number");
    Scanner input = new Scanner(System.in);
    int m = input.nextInt();
    System.out.println("Please enter the second number");

    int n = input.nextInt();

    System.out.println("Greatest common denominator of " + m + " and " + n + " is " + gcd(m, n));
  }
}
