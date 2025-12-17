package Week2SortingSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// import java.util.ArrayList;

// 719. Find K-th Smallest Pair Distance
/*


Example 1:
Input: nums = [1,3,1], k = 1
Output: 0
Explanation: Here are all the pairs:
(1,3) -> 2
(1,1) -> 0
(3,1) -> 2
Then the 1st smallest distance pair is (1,1), and its distance is 0.

Example 2:
Input: nums = [1,1,1], k = 2
Output: 0


Example 3:
Input: nums = [1,6,1], k = 3
Output: 5

 */

 //1. naive aproach but not work according to question because in question order matter

public class KthSmallestPairDist {
    public static int kthPair(int arr[], int k){
    int count = 0;
    for(int i=0; i<arr.length-1; i++){
        for(int j=i+1; j<arr.length; j++){
            int res = Math.abs(arr[i]-arr[j]);
            
            count++;
            if (count == k) {
                return res;
            }
        }
    }
      return -1;
    }

    // 2. naive perfect working solution O(n2logn2) wich not scalable for large input
    public static int kthPair2(int arr[], int k){
      ArrayList<Integer> diff = new ArrayList<>();
      for(int i=0; i<arr.length-1; i++){
         for(int j=i+1; j<arr.length; j++){
            diff.add(Math.abs(arr[i]-arr[j]));
         }
      }

      Collections.sort(diff);

      return diff.get(k-1);
    }

    // 3. efficient approach
    public static int kthPair3(int arr[], int k){
      Arrays.sort(arr);
      int low = 0; 
      int high = arr[arr.length-1] - arr[0];

      while (low < high) {
         int mid = low + (high - low)/2;

         if (countPairs(arr, mid) < k) {
             low = mid + 1;
         }else{
             high = mid;
         }
      }

      return low;
    }

    public static int countPairs(int arr[], int mid){
        int j=0, count =0;

        for(int i=0; i<arr.length; i++){
            while (j < arr.length && arr[j] - arr[i] <= mid) {
                j++;
            }

            count += (j-i-1);
        }

        return count;
    }

   public static void main(String[] args) {
     int arr[] = {1, 6, 1};
     int k = 3;
     System.out.println(" Kth Pair distance : "+ kthPair3(arr, k));
   } 
}
