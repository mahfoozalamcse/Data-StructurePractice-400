package Week2SortingSearching;

/*
//GFG  Count Inversions


Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).

Input: arr[] = [2, 3, 4, 5, 6]
Output: 0

 */

public class Inversion17 {
    public static int inversionCount(int arr[]) {
     
        int inv = 0;
        
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    inv++;
                }
            }
        }
        
        return inv;
    }

    // efficient approach
    // using merage sort 
    public static long inversionCount2(int arr[], int low, int high){
        long count = 0;
        if (low < high) {
            int mid = low + (high - low)/2;

            count +=inversionCount2(arr, low, mid);
            count +=inversionCount2(arr, mid+1, high);
            
            count += merge(arr, low, mid, high);

        }

        return count;
    }

    // helper method
    public static long merge(int arr[], int low, int mid, int high){
       
        int left[] = new int[mid-low+1];
        int right[] = new int[high-mid];

        for(int i=0; i<left.length; i++){
           left[i] = arr[low+i];
        }

        for(int i=0; i<right.length; i++){
            right[i] = arr[mid+1+i];
        }

        long swap = 0;
        int i=0, j=0, k=low;

        while (i < left.length && j < right.length) {
             if (left[i] <= right[j]) {
                arr[k++] = left[i++]; 
             }else{
                arr[k++] = right[j++];
                // all remaining is left[] is greater are inversion
                swap += (left.length-i);
             }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }

        return swap;

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(" Posible inverion : "+ inversionCount(arr));

        System.out.println(" Posible inverion efficient: "+ inversionCount2(arr, 0, arr.length-1));
    }
}

/*
 class Solution {
 static long inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static long mergeSort(int arr[], int low, int high){
        long count = 0;
        if(low < high){
           int mid = low + (high - low)/2;
           count += mergeSort(arr, low, mid);
           count += mergeSort(arr, mid+1, high);
           count += merge(arr, low, mid, high);
        }
        return count;
    }

    public static long merge(int arr[], int low, int mid, int high){
        int left[] = new int[mid - low + 1];
        int right[] = new int[high - mid];

        for(int i=0; i<left.length; i++)
            left[i] = arr[low + i];

        for(int i=0; i<right.length; i++)
            right[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = low;
        long swap = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
                swap += (left.length - i); // inversions
            }
        }

        while(i < left.length) arr[k++] = left[i++];
        while(j < right.length) arr[k++] = right[j++];

        return swap;
    }
}   
    
 */
