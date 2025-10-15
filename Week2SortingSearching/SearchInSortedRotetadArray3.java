package Week2SortingSearching;
// Leet code . 81. Search in Rotated Sorted Array II
/*
   Input: nums = [2,5,6,0,0,1,2], target = 0
   Output: true

   Input: nums = [2,5,6,0,0,1,2], target = 3
   Output: false

 */

public class SearchInSortedRotetadArray3 {
   public static int searchRotatedSortedArray(int arr[], int target){
      int start = 0;
      int end = arr.length-1;

     while (start <= end) {
         int mid = start + (end - start)/2;

         if (arr[mid] == target) {
            return mid;
         }

         if (arr[mid] == target && arr[mid] == arr[end]) {
            start++;
            end--;
         }

         // left case
         else if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target < arr[mid]) {
               end = mid-1;
            }else{
               start = mid+1;
            }
         }

         // right case
         else{
            if (arr[mid] < target && target <= arr[end]) {
                start = mid + 1;
            }else{
               end = mid - 1;
            }
         }
     }
     return -1;
   }
   public static void main(String[] args) {
     int[] arr = {2,5,6,0,0,1,2};
     int target = 0;
     System.out.println(" Search roteted : "+ searchRotatedSortedArray(arr, target));
     
     int search = 3;
     System.out.println(" Search roteted : "+ searchRotatedSortedArray(arr, search));
   }
}
