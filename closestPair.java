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
    double d_min = Double.POSITIVE_INFINITY;
    int p1=0;
    int p2=0; // these are the two points closest to each other

    // for each point in the array
    for (int i=0; i<points.length; i++)
    {
      // contains all distances for current point
      // calculate distance between every other point and put in array
      for(int j=0; j<points.length; j++)
      {
        double d = distance(points[i], points[j]);
        if(d<d_min && d!=0)
        {
          // update dmin
          p1=i; p2=j;
          d_min = d;
        }
      }
    }
    System.out.println("Points " + p1 + " and " + p2 + " are closest to each other");
    return d_min;
    //return -1;

  }

  public static double distance(double[] a, double[] b){
    // computes distance between point a and b
    return Math.sqrt (Math.pow( (a[0]-b[0]),  2 ) + Math.pow( (a[1]-b[1]),  2 ) );
  }


}
