// MergeSort divide-and-conquer algorithm that sorts elements in an array
import java.util.*;
import java.io.*;
import java.lang.*;

public class mergesort{


  public static int[] merge(int[] a, int[] b){

    // merges two sorted lists a and b
    int[] m = new int[a.length+b.length];
    System.out.println("Length of m : " + m.length);
    // counters for a and b, only increment or decrement if already marked
    int l=0;
    int r=0;
    for(int i=0;i<m.length; i++){
      if(r<b.length)
      {
        //compare each element of a and b
          if(a[l]<b[r]) {
            System.out.printf("a[%d]<b[%d] because %d < %d%n", l, r, a[l], b[r]);
            m[i]=a[l];
            i++;
            //System.out.printf("b[%d] = %d%n", r, b[r]);
            m[i]=b[r];
            System.out.printf("m[%d] = %d%n", i, m[i]);
          //  l++;
          }
          else{
            System.out.printf("a[%d]>b[%d] because %d > %d%n", l, r, a[l], b[r]);

              m[i]=b[r];
          //    i++;
              r++;
            //  m[i]=a[l];
              System.out.printf("m[%d] = %d%n", i, m[i]);
          }
      }
      // fill remainder of m withleft values
      if(l<a.length){
        m[i]=a[l];
        l++;
      }


    }
    System.out.println("Merged: " + Arrays.toString(m));

    return m;
  }

  public static int[] merge_sort(int[] a){
    // base case: if only one element in array, return that
    if(a.length==1){
      return a;
    }

    // divide array into two
    int[] left = new int[a.length/2];
    int[] right = new int[a.length/2];

    // populate left and right sides
    for(int i=0; i<left.length; i++){
      left[i] = a[i];
    }
    int i=left.length;

    for(int j=0; j<right.length; j++){
      right[j] = a[i];
      i++;
    }


    // checking left and right arrays
    System.out.println("Left: " + Arrays.toString(left));
    System.out.println("Right: " + Arrays.toString(right));
    // call sort on both sides
    int[] left_sorted = merge_sort(left);
    int[] right_sorted = merge_sort(right);

    // merge both sorted arrays
    return merge(left_sorted, right_sorted);
  }



  public static void main(String[] args){
    // get array to be sorted
    int[] arr = {3, 4, 2, 1};
    merge_sort(arr);

  }
}
