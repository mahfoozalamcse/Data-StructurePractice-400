package Week2SortingSearching;
// Maximum subarray size having all subarrays sums less than k
/*
Input :  arr[] = [1, 2, 3, 4], k = 8.
Output : 2
Explanation: Following are the sum of subarray of size 1 to 4.

Sum of subarrays of size 1: 1, 2, 3, 4. 
Sum of subarrays of size 2: 3, 5, 7. 
Sum of subarrays of size 3: 6, 9. 
Sum of subarrays of size 4: 10. 


Input:  arr[] = [1, 2, 10, 4], k = 8. 
Output : -1 
Explanation: There is an array element (10) with value greater than k, so subarray sum cannot be less than k. 

Input :  arr[] = [1, 2, 10, 4], k = 14 
Output : 2


 */

public class MaxSubArrayLessThanSum11 {
    public static boolean isValid(int arr[], int mid , int k){
        int n = arr.length;
        int sum = 0;

        // step 1 first size window
        for(int i=0; i<mid; i++){
            sum += arr[i];
        }

        if (sum > k) {
            return false; // first windows invalid
        }

        // slide window
        for(int i=mid; i<n; i++){
            sum += arr[i] - arr[i-mid];

            if (sum > k) {
                return false; // any invalid windows
            }
        }

        // all windows is correct
        return true;
    }
    // main logic
    // total time O(nlogn) => O(n) for is valid and binary serach logn
    
    public static int subArrLessSize(int arr[], int k){
       int n = arr.length;
       int low = 1, high = n, ans = -1;

       while (low <= high) {
           int mid = low + (high - low)/2;

           if (isValid(arr, mid, k)) { // mid is valid try bigger
              ans = mid;
              low = mid + 1;
           }else{
             high = mid - 1;
           }
       }

       return ans;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 8;

        System.out.println("Maximum subarray size: " + subArrLessSize(arr, k));
    }
    
}
