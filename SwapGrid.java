import java.util.*;
import java.io.*;
import java.lang.*;

public class SwapGrid{

  public static void main(String[] args){
    System.out.println("Please enter grid rows");
    Scanner input = new Scanner(System.in);
    int rows = input.nextInt();
    System.out.println("Please enter grid columns");
    int cols = input.nextInt();

    // create grid ie 2d array
    int[][] grid = new int[rows][cols];
    System.out.printf("Please enter %d values%n", rows*cols);
    // populate with values
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        grid[i][j] = input.nextInt();
      }
    }

    // perform swap
    int[][] s = swap(grid, rows, cols);
    for(int k=0; k<s.length; k++){
      System.out.println(Arrays.toString(s[k]));
    }

  }

  public static int[][] swap(int[][] g, int r, int c){
    int[][] swapped = new int[c][r];
    for(int i=0; i<swapped.length; i++){
      for(int j=0; j<swapped[i].length; j++){
        swapped[i][j] = g[j][i];
      }
    }
    return swapped;
  }
}
