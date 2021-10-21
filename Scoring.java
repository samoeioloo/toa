import java.util.*;
import java.io.*;
import java.lang.*;


public class Scoring{


  public static void main(String[] args){
    // read in N and list of numbers needed
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter N");
    int N = input.nextInt();
    System.out.println("Please enter " + N + " numbers");
    int[] numbers = new int[N];
    //String[] numsString = input.nextLine().split("\n");
    // populate array
    for(int i=0; i<N; i++){
      numbers[i] = input.nextInt();
    }
    System.out.println("Please enter the target T");
    int T = input.nextInt();
    int total=1;
    ArrayList<Integer> totals = new ArrayList<Integer>();
    for(int i=0; i<numbers.length; i++)
    {
      if(valid(total+numbers[i], T))
      {
        if(valid(total*numbers[i], T)){
          //if((total+numbers[i]) > (total*numbers[i]))
          //both are valid so perform both
          {
            total += numbers[i];
          }
          else
          {
            total *= numbers[i];
          }
      }

        else {
          total+= numbers[i];
        }
        //System.out.printf("%dth element of numbers is %d%n",i,numbers[i]);


        //System.out.printf("Current total: %d%n", total);

      }
      else if(valid(total*numbers[i], T)){
        //System.out.printf("%dth element of numbers is %d%n",i,numbers[i]);

        //System.out.printf("Adding not valid so Multiplying %d by %d %n", numbers[i], total);

        total*= numbers[i];
        //System.out.printf("Current total: %d%n", total);

      }
    }
    System.out.println(total);

  }

  public static boolean valid(int number, int target){
    if (number < target){  return true;}
    return false;
  }

  public static int max(int a, int b){
    if(a>b){  return a;}
    return b;
  }
}
