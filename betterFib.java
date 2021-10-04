import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class betterFib{

  public static BigInteger fibo(int n){
    if(n==0){ return new BigInteger("0");}
    if(n==1){ return new BigInteger("1");}

    BigInteger[] table = new BigInteger[3]; // only contains current number and  2 prev
    // better use of space
    table[0] = new BigInteger("0");
    table[1] = new BigInteger("1");

    for (int i=2; i<=n ; i++){
      table[2] = table[1].add(table[0]);
      table[0] = table[1]; // update table for next iteration
      table[1] = table[2];
    }

    // more efficient since same memory is used 
    return table[2];
  }


  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter some n value");
    int n = input.nextInt();
    System.out.println("F["+n+"] = "+ fibo(n));


  }
}
