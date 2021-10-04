import java.io.*;
import java.util.*;

public class euclidNoRecurs{

  public static int gcd(int m, int n){
    // no more efficientt than recursive solution since
    // for some compilers optimise tail recursive solutions
    // so these would basically be the same i.t.o efficiency
    // since they look alike
    int r;

    while(n != 0){
      r = m%n;
      m = n;
      n = r;
    }

    return m;
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
