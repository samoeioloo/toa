import java.io.*;
import java.util.*;
import java.lang.*;


public class convHull {
  static double[][] POINTS = {{-4, 2}, {-1, 7},{1, 3}, {2, 8},  {2, 1}, {3,-3}, {5, 1}, {4, 4}};



  public static double side(double[] a, double[] b, double[] p)
  {
    // this function returns a positive or negative number depending on the side on which point p lies of line AB
    double d = ( ( (p[0] - a[0]) * (b[1] - a[1]) )  - ( (p[1] - a[1]) * (b[0]-a[0]) ) );
    return d;
  }

  public static ArrayList<double[]>  isBorder()
  {
    // returns true if the two points create a line on border of convex hull
    ArrayList<double[]> borders = new ArrayList<double[]>() ;
    // for all points
    for(int i=0; i<POINTS.length; i++)
    {
      // for all neighbouring points
      for(int k=i+1; k<POINTS.length; k++)
      {
      //  System.out.println("Checking pair: " + Arrays.toString(POINTS[i]) + " " + Arrays.toString(POINTS[k]));
        ArrayList<Double> sides = new ArrayList<Double>();
        // checking tmp vals
        for(int n=0; n<POINTS.length; n++) // O(n^3)
        {
          double[] test = POINTS[n];
          // find which side of line the test is on
          double d = side(POINTS[i], POINTS[k], POINTS[n]);
          // append to sides

          sides.add(d);
          //System
        }
        // check if sides for this pairing is same
        if (neg(sides) || pos(sides))
        {

          borders.add(POINTS[i]);
          borders.add(POINTS[k]);
        }
      }
    }
        /**double[] tmp = POINTS[i];
        double d = side(p1, p2, tmp);
        sides.add(d);
        //System.out.println("Printing sides array for pairing " + p1[0] + "," + p1[1] + " and " + p2[0] + "," + p2[1] );
        if (neg(sides) || pos(sides))
        {
          System.out.println("p1 and p2 are borders");
          borders.add(p1); borders.add(p2);
        }
      }
      for (int i=0; i<borders.size(); i++){
        System.out.println(Arrays.toString(borders.get(i)));
      }
      /**
      System.out.println("is all neg: ");
      System.out.println(neg(sides));
      System.out.println("is all pos: ");
      System.out.println(pos(sides));*/
//  return false;
    return borders;
  }
  public static void main(String[] args)
  {


    System.out.println(isBorder().toString());
  }

  public static boolean neg(ArrayList<Double> d)
  {
    int negative = -1;
    // iterate through all elements of arraylist, return true if all positive
    for(int i=0; i<d.size(); i++)
    {
      if(d.get(i)>0)
      {
        negative = 1;
      }

    }
    if(negative>0){ return false;}
    return true;
  }

  public static boolean pos(ArrayList<Double> d)
  {
    int positive = -1;
    // iterate through all elements of arraylist, return true if all positive
    for(int i=0; i<d.size(); i++)
    {
      if(d.get(i)<0)
      {

        positive = 1;
      }

    }
    if(positive>0){ return false;}
    return true;
  }

}
