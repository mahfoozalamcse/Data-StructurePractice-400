package Week2SortingSearching;
/*1. week 2
 *Leetcode  34. Find First and Last Position of Element in Sorted Array
 */

import java.util.Arrays;

/* 
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Input: nums = [], target = 0
Output: [-1,-1]

you must implent in O(log n).

*/



public class firstAndLastIdx {
    // binary search just only practice

   public static int binarySearch1(int arr[],int start, int end, int target){
     if (arr.length == 0) {
        return -1;
     }

     int mid =  start + (end - start)/2;

     if (target == arr[mid]) {
        return mid;
     }

     if (target < arr[mid]) {
         return binarySearch1(arr, start, mid-1, target);
     }
     return binarySearch1(arr, mid+1, end, target);
     
   }


   // firts and last index original problem solved
   public static int firstIdx(int arr[],int start, int end, int target){
      if (start > end) {
        return -1;
      }

      int mid = start + (end - start)/2;

      if (arr[mid] == target && (mid == 0 || arr[mid-1] != target)) {
        return mid;
      }

      if (arr[mid] >= target) {
          return firstIdx(arr, start, mid-1, target);
      }else{
        return firstIdx(arr, mid+1, end, target);
      }
   }


   // last index
   public static int lastIndex(int arr[], int start, int end, int target){
     if (start > end) {
        return -1;
     }

     int mid = start + (end - start)/2;

     if (arr[mid] == target && (mid == arr.length-1 || arr[mid+1] != target)) {
        return mid;

     }else if(arr[mid] <= target){
        return lastIndex(arr, mid+1, end, target);

     }else{
        return lastIndex(arr, start, mid-1, target);
     }
   }

   
   public static void main(String[] args) {
     int arr[] = {12, 23, 45, 89, 91, 91, 91, 93};

    //  System.out.println(" Target present at index : ");
    //  System.out.println(binarySearch1(arr, 0, arr.length-1, 89));

    System.out.println(" First Index : " + firstIdx(arr, 0, arr.length-1, 91));


    System.out.println(" Last Index : " + lastIndex(arr, 0, arr.length-1, 91));

    int target = 91;
    System.out.println("Last index of " + target + ": " +
                           lastIndex(arr, 0, arr.length - 1, target));

    
   // Leet code like driver code
     int[] op = new int[2];
     Arrays.fill(op, -1);

     op[0] = firstIdx(arr, 0, arr.length-1, target);
     op[1] = lastIndex(arr, 0, arr.length-1, target);

     // return op;

     System.out.println("[" + op[0] + "," +op[1]+ "]");
   }
}
