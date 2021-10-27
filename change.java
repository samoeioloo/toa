import java.util.*;
import java.io.*;
import java.lang.*;


public class change{

    public static void main(String[] args){
        int[] d = {1,2,5,10,20,25,50,100,200};
        System.out.println("Coins for R500: " + makeChange(d, 505, d.length));
    }


    public static double makeChange(int[] d, int amount, int numDems){
        // array containing minimum coins for all amounts from 1 to amount
        double[] M = new double[amount+1];
        M[0] = 0;

        for(int i=1; i<=amount; i++){ // for all amounts from R1 to R325
            double minimum = Double.POSITIVE_INFINITY; // initially, for each amount we dont know what minimum will be, so set to infinity
            
            for(int j=0; j<numDems; j++){
                if (i >= d[j]){ // if we need more coins
                    // subtract amount from denomination val and find minimum
                    //System.out.printf("M[i-denomination] is M[%d] = %f%n", i-d[j], M[i-d[j]]);
                    minimum = min(M[i-d[j]], minimum) +1;
                   // System.out.printf("minimum: " + minimum);
                }
                //System.out.printf("Minimum for amount of i %d is %f%n", i, minimum);


            }
            M[i] = minimum;

        }
        return M[M.length-1];

    }

    public static double min(double a, double b){
        if(a<b){
            return a;

        }
        return b;
    }
}