import java.util.*;
import java.io.*;
import java.lang.*;

public class Modulus {

  public static void main(String[] args)
  {
    // Read in N and Z values
    Scanner input = new Scanner(System.in);
    //System.out.println("Please enter a value for N");
    int N = input.nextInt();
    //System.out.println("Please enter a value for Z");
    int Z = input.nextInt();
    // constraints
    if((N < 1) || (N>1000) || (Z < 0) || (Z > N)){
      System.out.printf("%d", 0);
      System.exit(0);
    }
    // array list holding all pairs that satsify the condition
    ArrayList<Integer[]> pairs = new ArrayList<Integer[]>();
    // double for loop to n to find x and y
    for(int i=0; i<N; i++)
    {
      for(int j=0; j<N; j++)
      {
        if(((i * j) % N) == Z) // satisfies conditions
        {
          // make pair to enter into ArrayList
          Integer[] valid = new Integer[2];
          valid[0]=i; valid[1]=j;
          pairs.add(valid);

        }
      }
    }

    System.out.println(pairs.size());
    /** return all possible pairs
    for(int k=0; k<pairs.size(); k++)
    {
      System.out.println(Arrays.toString(pairs.get(k)));
    }*/

  }
}
