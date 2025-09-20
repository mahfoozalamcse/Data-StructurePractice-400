package Assighnment2;

import java.util.ArrayList;

// Array Duplicate leet code

public class ArrayDuplicate7 {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        
        // brute force compare each element O(n^2)
        // approach 1 use hash set extra space
        
        // HashSet<Integer> seen = new HashSet<>();
        // ArrayList<Integer> op = new ArrayList<>();
        
        // for(int i=0; i<arr.length; i++){
        //     if(seen.contains(arr[i])){
        //         op.add(Math.abs(arr[i]));
        //     }else{
        //         seen.add(arr[i]);
        //     }
        // }
        
        // return op;
       
         // approach 2 using index modification in time O(n) and space O(1)
         ArrayList<Integer> op = new ArrayList<>(); 
         for(int i = 0; i< arr.length; i++){
             
             int index = Math.abs(arr[i])-1;
             
             if(arr[index] < 0){
                op.add(Math.abs(arr[i])); // exist duplicate
             }
             
             arr[index] = - arr[index];
         }
         
         return op;
    }
}

