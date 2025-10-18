package Week2SortingSearching;
// Leetcode 31 next permutation
/*

Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]

Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]

Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
 */
public class NextPermutation19 {
    public static void pemutation(int arr[]){
        int n = arr.length;
        int i = n-2;

        //1. find next decreasing order
        while (i>=0 && arr[i] >= arr[i+1]) {
             i--;
        }

        if(i >=0){
            // step 2 find graeter than arr[i]
            int j = n - 1;

            while (arr[j] <= arr[i]) {
                j--;
            }

            // step 3  swap
            swap(arr, i, j);

        }

        // step 4 reverse
        reverse(arr, i+1, n-1);
    }

    public static void reverse(int arr[], int start, int end){
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    public static void swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
  }

    // perint array
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        pemutation(arr);

        printArr(arr);


    }
}
