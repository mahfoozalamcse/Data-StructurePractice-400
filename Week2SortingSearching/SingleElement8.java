package Week2SortingSearching;

/* 

// Leet code 540. Single Element in a Sorted Array
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Input: nums = [3,3,7,7,10,11,11]
Output: 10

*/

// naive solution O(n2) tack one by one check duplicate or not 
// 
public class SingleElement8 {
    public static int duplicate(int arr[]){

      for(int i=0; i<arr.length-1; i+=2){
         if (arr[i] != arr[i+1]) {
            return arr[i];
         }
      }

      return arr[arr.length-1];
    }

    // use binary serach
    public static int singlDulicate(int arr[]){
        int start = 0, end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (arr[mid] == arr[mid+1]) {
                 start = start + 2;
            }else{
                 end = mid;
            }
        }

        return arr[start];
    }
    public static void main(String[] args) {
        int arr[] = {3,3,7,7,10,11,11};
        System.out.println(" Single element : " + duplicate(arr));

        System.out.println(" single Duplicate approach 2 : "+ singlDulicate(arr));
        
    }
}
