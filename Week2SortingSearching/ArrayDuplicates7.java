package Week2SortingSearching;
/* 

// Geeks for geeks => Array Duplicates
Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Input: arr[] = [3, 1, 2] 
Output: []

*/

import java.util.ArrayList;

import java.util.HashSet;

public class ArrayDuplicates7 {
    public static ArrayList<Integer> arrayDuplicate(int[] arr){
       ArrayList<Integer> op = new ArrayList<>();
       HashSet<Integer> seen = new HashSet<>();

       for(int i=0; i<arr.length; i++){
          if (seen.contains(arr[i])) {
            op.add(arr[i]);
          }

          seen.add(arr[i]);
       }

       return op;
    }

    // usind index modification
    /*
     * this approach work when 
     *1. All elements are positive integers in the range 1 to n
     *2. The array is mutable (we allowed to modify its contents).
     * 
     */
    public static ArrayList<Integer> arrayDuplicate2(int arr[]){
      ArrayList<Integer> op = new ArrayList<>();
      for(int i=0; i<arr.length; i++){
         int index = Math.abs(arr[i])-1;

         if (arr[index] < 0) {
             op.add(Math.abs(arr[i]));
         }

         arr[index] = -arr[index];

      }

      return op;
    }
    public static void main(String[] args) {
      int arr[] = {2, 3, 1, 2, 3};
      System.out.println(" Duplicate : "+ arrayDuplicate(arr));  


      System.out.println(" Duplicate answer 2 "+ arrayDuplicate2(arr));
    }
}
