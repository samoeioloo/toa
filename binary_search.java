
/**
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.



*/
import java.util.*;

public class binary_search{

  public static int search(int[] nums, int target) {
      // find pivot
      int pivot = nums[nums.length/2];
      // compare pivot to target: base case
      if(pivot==target){
        return nums.length/2; // pivot's index
      }
      int d;
      if (nums.length % 2 == 0){
        d=nums.length/2;

      }
      else{
        d= nums.length/2 +1;
      }
      // split array
      int[] left = new int[nums.length/2];
      int[] right = new int[d];

      // populate left and right
      for(int i=0; i<nums.length/2; i++)
      {
        left[i]=nums[i];
        right[i]=nums[i+(nums.length/2)];
      }
      right[d-1]=nums[nums.length-1];
      // compare target to pivot to see which array to traverse
      if(target < pivot){
        // search left
        //System.out.println("Target is less than pivot. Traversing left");
        return search(left, target);
      }
      else if(target > pivot){
        //System.out.println("Target is more than pivot. Traversing right");

        return nums.length/2 + search(right, target);
      }

      // not found
      return -1;
  }
    public static void main(String[] args){

      int[] nums = {-1,0,2,3,5,9,12,15,18};
      System.out.printf("%d", search(nums, 18));
    }

}
