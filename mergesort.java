// MergeSort divide-and-conquer algorithm that sorts elements in an array
import java.util.*;
import java.io.*;
import java.lang.*;

public class mergesort{


  public static void merge_sort(int[] array){

    return ;
  }

  public static void sort(int[] a){
    // base case: if only one element in array, return that
    if(a.length==1){
      return a[0];
    }

    // divide array into two
    int[] left = new int[a.length/2];
    int[] right = new int[a.length/2];

    // populate left and right sides
    for(int i=0; i<left.length; i++){
      left[i] = a[i];
    }

    for(int j=0; j<right.length; j++){
      int i=left.length;
      right[j] = a[i];
      i++;
    }

    // checking left and right arrays
    System.out.println("Left: " + Arrays.toString(left));
    System.out.println("Right: " + Arrays.toString(right));

    return ;
  }



  public static void main(String[] args){
    // get array to be sorted
    int[] arr = {3, 4, 2, 1};
    sort(arr);

  }
}
