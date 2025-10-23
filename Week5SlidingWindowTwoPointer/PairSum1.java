package Week5SlidingWindowTwoPointer;

import java.util.Arrays;
import java.util.HashSet;
// Two Sum - Pair with Given Sum
/*
Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: arr[3] + arr[4] = -3 + 1 = -2

Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: None of the pair makes a sum of 0

Input: arr[] = [11], target = 11
Output: false
Explanation: No pair is possible as only one element is present in arr[]

 */
public class PairSum1 {
     // 1 use nested loop O(n2) too much time taken
     // 2. use HashSet need extra space
     public static boolean twoSum2(int arr[], int target){
        HashSet<Integer> seen = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];

            if (seen.contains(complement)) {
                return true;
            }

            seen.add(arr[i]);

        }

        return false;
     }

     // use here two pointer to solve in O(nlogn) time

     public static boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        
        int start = 0, end = arr.length-1;
        
        while(start < end){
            
          int res = arr[start] + arr[end];
          
          if(res == target){
              return true;
          }
          
          else if(res < target){
              start++;
          }else{
              end--;
          }
        }
        
        
        return false;
    } 

    public static void main(String[] args) {
       int arr[] = {0, -1, 2, -3, 1};
       int target = -2;
       
       System.out.println(" Result using HashSet : " + twoSum2(arr, target));
       System.out.println(" Result using Two Pointer : " + twoSum(arr, target));
    }
}
