package Week2SortingSearching;

/* 
// Leet code 154. Find Minimum in Rotated Sorted Array II
Input: nums = [1,3,5]
Output: 1
Input: nums = [2,2,2,0,1]
Output: 0

*/
public class FindMinimumSortedRoteted4 {
    public static int findMinSortedRotatedArr(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
           int mid = start + (end - start)/2;

           if (arr[mid] > arr[end]) {
              start = mid + 1;
           }
           else if (arr[mid] < arr[end]) {
              end = mid;
           }else{
              end--;
           }
        }

        return arr[start];
    }
    public static void main(String[] args) {
       int arr[] = {2,2,2,0,1};
       System.out.println(" Sorted min array : "+ findMinSortedRotatedArr(arr)); 
    }
}
