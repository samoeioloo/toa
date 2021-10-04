import java.io.*;
import java.util.*;

public class bf_fib{

  public static long fibo(long n){
    if(n==0){ return 0;}
    if(n==1){ return 1;}

    return fibo(n-1) + fibo(n-2);
  }


  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter some n value");
    long n = input.nextLong();
    System.out.println("F["+n+"] = "+ fibo(n));


  }
}
