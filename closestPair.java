import java.util.*;
import java.io.*;
import java.lang.*;

public class closestPair{

//  Set<Integer[]> POINTS = new Set<Integer[]>();
  static double[][] POINTS = {{4, 2}, {3, 7}, {-2, 10}, {-1, 5}, {2, 1}, {1,1}, {1, 4}, {0, 0}};

  public static void main(String[] args)
  {
    System.out.println("Calculating distance between first and second points");
    System.out.println("Distance is " + findClosest(POINTS));
  }


  public static double findClosest(double[][] points)
  {
    // for each point in the array
  //  for (int i=0; i<points.length; i++)
  //  {
      return distance(points[0], points[1]);
  //  }
    //return -1;

  }

  public static double distance(double[] a, double[] b){
    // computes distance between point a and b
    return Math.sqrt (Math.pow( (a[0]-b[0]),  2 ) + Math.pow( (a[1]-b[1]),  2 ) );
  }


}