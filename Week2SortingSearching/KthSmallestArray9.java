package Week2SortingSearching;
//GFG => Kth smallest element in the array using constant space when array can't be modified

public class KthSmallestArray9 {

  // Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
  // Output: 7 
  // Input: arr[] = {12, 3, 5, 7, 19}, K = 2 
  // Output: 5
  
  // helper method 
  // find min 
  // find max 
  // find 
  public static int findMin(int[] arr){
     int min = Integer.MAX_VALUE;

     for(int i=0; i<arr.length; i++){
       if (arr[i] < min) {
         min = arr[i];
       }
     }

     return min;
  }

  // max
  public static int findmax(int arr[]){
     int max = Integer.MIN_VALUE;

     for(int i=0; i<arr.length; i++){
      if (arr[i] > max) {
         max = arr[i];
      }

     }

     return max;
  }

  // count 
  public static int counts(int arr[], int element){
     int count =0;

     for(int i=0; i<arr.length; i++){
        if (arr[i] <= element) {
          count++;
        }
     }

     return count;
  }
  public static int kthSmall(int arr[], int k){
     int start = findMin(arr);
     int end = findmax(arr);

     while (start < end) {
       int mid = start + (end - start)/2;
       int countElementLess = counts(arr, mid);

       if (countElementLess < k) {
          start = mid+1;
       }else{
          end = mid;
       }
     }
     return start;
  }


  public static void main(String[] args) {
    // int arr[] = {7, 10, 4, 3, 20, 15};
    // int k = 3;

    // System.out.println(" Kth small element : "+ kthSmall(arr, k));

    int[] arr = {12, 3, 5, 7, 19};
    int k = 2;

    System.out.println(" Kth small element : "+ kthSmall(arr, k));
    
  }  
}
