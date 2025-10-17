package Week2SortingSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SegrateEvenOdd18 {
    static void segregateEvenOdd(int arr[]) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        // Separate evens and odds
        for(int num : arr) {
            if(num % 2 == 0) even.add(num);
            else odd.add(num);
        }

        // Sort both parts
        Collections.sort(even);
        Collections.sort(odd);

        // Merge back into arr[]
        int i = 0;
        for(int num : even) arr[i++] = num;
        for(int num : odd) arr[i++] = num;
    }

    // efficient approach
    public static void segregateEvenOdd2(int arr[]){
         int n = arr.length;
        
        int left = 0;
        int right = n-1;
        
        // apply algo based on even and odd
        while(left <= right){
            
            // even case simply move forword
            while(left < right && arr[left] % 2 == 0 ){
                left++;
            }
            
            // odd case simply move forword
            while(right >=0 && arr[right] % 2 != 0){
                right--;
            }
            
            // else swap right even to left odd make left even 
            if(left < right){
                int temp  = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
        }
        
        // sort both portion based on partion index and first odd point
        int partion = left;
        
        Arrays.sort(arr, 0, partion);
        Arrays.sort(arr, partion, n);
    }

    public static void segregateEvenOdd3(int arr[]){
       segregateEvenOddHelper(arr);
    }
    static void segregateEvenOddHelper(int[] arr) {
        int max = 100000;
        int[] freq = new int[max + 1];
        for (int num : arr) freq[num]++;

        int index = 0;
        // Fill evens sorted
        for (int i = 0; i <= max; i += 2) {
            while (freq[i]-- > 0)
                arr[index++] = i;
        }
        // Fill odds sorted
        for (int i = 1; i <= max; i += 2) {
            while (freq[i]-- > 0)
                arr[index++] = i;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        segregateEvenOdd(arr);
        System.out.println(Arrays.toString(arr)); // [8, 12, 34, 90, 3, 9, 45]

        segregateEvenOdd2(arr);
        System.out.println(" Segregate : " + Arrays.toString(arr));
    }
}
