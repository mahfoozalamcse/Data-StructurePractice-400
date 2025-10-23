package Week5SlidingWindowTwoPointer;


// Pair with given sum in a sorted array
/*

Input: arr[] = [-1, 1, 5, 5, 7], target = 6
Output: 3
Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.
Input: arr[] = [1, 1, 1, 1], target = 2
Output: 6
Explanation: There are 6 pairs which sum up to 2 : {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.
Input: arr[] = [-1, 10, 10, 12, 15], target = 125
Output: 0
Explanation: There is no such pair which sums up to 125.

 */

public class PairWithGivenSum2 {

    public static int countPairs1(int arr[], int target){
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }

        return count;
    }

    // use two pointer
    public static int countPairs2(int arr[], int target){
       int start = 0;
       int end = arr.length-1;

       int count = 0;

       while (start < end) {
         int sum = arr[start] + arr[end];

         if (sum == target) {
              if (arr[start] == arr[end]) {
                   int n = end - start + 1;
                   count += (n * (n-1))/2;
                   break;
              }

              // left sum if same
              int leftCount = 1;
              while(start+1 < end && arr[start] == arr[start+1]) {
                 leftCount++;
                 start++;
              }

              // right count 
              int rightCount = 1;
               while (end-1 > start && arr[end] == arr[end-1]) {
                   rightCount++;
                   end--;
               }

               count += leftCount*rightCount;

               start++;
               end--;
         }
         else if (sum < target) {
              start++;
         }else{
              end--;
         }
       }

       return count;
    }
   public static void main(String[] args) {
       int arr[] = {-1, 1, 5, 5, 7};
       int target = 6;
       System.out.println(" Count pair "+ countPairs1(arr, target)); // o/p 3

        int[] arr2 = {1, 1, 1, 1};
        int target2 = 2;
        System.out.println(" Count pair "+countPairs2(arr2, target2)); // Output: 6

        int[] arr3 = {-1, 10, 10, 12, 15};
        int target3 = 125;
        System.out.println(" Count pair " +countPairs2(arr3, target3)); // Output: 0
   } 
}
