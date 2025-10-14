package Week2SortingSearching;

/* 
// week 2 => ques. 2

// Leet code 35. Search Insert Position
Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 2
Output: 1

Input: nums = [1,3,5,6], target = 7
Output: 4

*/
public class SearchInsertion2 {
 
  // serach insert
  public static int searchInsert(int arr[], int target){
    int start = 0;
    int end = arr.length-1;

    while(start <= end){
        int mid = start + (end - start)/2;

       if (arr[mid] == target) {
        return mid;
        }
        else if (arr[mid] < target) {
            start = mid+1;
        }else{
            end = mid - 1;
        }
    }
      return start;
  }
  public static void main(String[] args) {
    int[] arr = {1,3,5,6};
    int target = 2;

    System.out.println(" Search insert index : "+ searchInsert(arr, target));

  }  
}
