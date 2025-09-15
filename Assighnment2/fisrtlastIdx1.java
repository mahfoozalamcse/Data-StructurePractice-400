package Assighnment2;

import java.util.Arrays;

// Leetcode 34. Find First and Last Position of Element in Sorted Array

public class fisrtlastIdx1 {
      // binary search
    public static int binarySearch(int nums[], int start, int end, int target){
       if(start > end){
         return -1;
       }

       int mid = start + (end - start)/2;

       if(nums[mid] == target){
          return mid; 
       }

       if(nums[mid] < target){
          return binarySearch(nums, mid+1, end, target);
       }

       return binarySearch(nums, start, mid-1, target);
    
    }

    // find first index using recursion

    public int firstIndex(int[] nums, int start, int end, int target){
        // exceed index and not found target

         if(start > end){
            return -1;
         }

         int mid = start + (end - start) / 2;

         if(nums[mid] == target && (mid ==0 || nums[mid-1] != target)){
            return mid;
         }

         if(nums[mid] >= target){
            return firstIndex(nums, start, mid-1, target);
         }
         else{
            return firstIndex(nums, mid+1, end, target);
         }
    }

    // iterative approch to find first index
    public static int firstIndex2(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/ 2;

            if(nums[mid] == target){
                ans = mid;
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return ans;
    }

    // find last index using recursion
     public int lastIndex(int[] nums, int start, int end, int target){
        if(start > end){
            return -1;
        } 

        int mid = start + (end - start)/2;
        if(nums[mid] == target && (mid == nums.length-1 || nums[mid+1] != target)){
            return mid;
        }else if(nums[mid] < target){
            return lastIndex(nums, mid+1, end, target);
        }else{
            return lastIndex(nums, start, mid-1, target);
        }
    }

    // iterative solution of find last index
    public static int lastIndex2(int []nums,  int target){
      int start = 0; 
      int end = nums.length-1;
      int ans = -1;

      while(start <= end){
         int mid = start + (end - start)/2;

         if(nums[mid] == target){
            ans = mid;
            start = mid+1;
         }else if(nums[mid] < target){
            start = mid+1;
         }else{
            end = mid - 1;
         }
      }

      return ans;
    }

    public int[] searchRange(int[] nums, int target) {
       int[] op = new int[2];
       Arrays.fill(op, -1);
       op[0] = firstIndex2(nums, target);
       op[1] = lastIndex2(nums, target);

       return op;
    }

}
