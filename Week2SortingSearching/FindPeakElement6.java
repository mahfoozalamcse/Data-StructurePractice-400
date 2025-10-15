package Week2SortingSearching;
/*
 
// Leet code 162. Find Peak Element
Input: nums = [1,2,3,1]
Output: 2

Input: nums = [1,2,1,3,5,6,4]
Output: 5


*/

public class FindPeakElement6 {
    public static int peekElement(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] < arr[mid+1]) {
                start = mid+1; // right end peek
            }
            else{
                end = mid;
            }
        }

        return arr[start];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,6,4};
        System.out.println();
        System.out.println(" Peek element : "+ peekElement(arr));
    }
}
