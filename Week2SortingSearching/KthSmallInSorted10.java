package Week2SortingSearching;

import java.util.ArrayList;
import java.util.Collections;

/* 

//Leetcode 378. Kth Smallest Element in a Sorted Matrix

Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
output : 13

Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13

Input: matrix = [[-5]], k = 1
Output: -5

*/


public class KthSmallInSorted10 {

    // need first count less than mid helper
    public static int countLessThanEqual(int matrix[][], int mid){
        int n = matrix.length;
        int count = 0;
        int row = n-1, col = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                count += row + 1;
                col++;
            }
            else{
                row--;
            }
        }

        return count;
    }

    // main method of kth small in metrix
    public static int kthSmallMatrix(int matrix[][], int k){
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];

        while (low < high) {
            int mid = low + (high-low)/2;

            int count = countLessThanEqual(matrix, mid);

            if (count < k) {
                low = mid+1;
            }else{
                high = mid;
            }
        }

        return low;
    }

    // naive approach
    public static int kthSmall(int[][] matrix, int k){
        int n = matrix.length;
        // step 1 create list 
        // add in list
        // sort list
        // return kth
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                list.add(matrix[i][j]);
            }
        }

        // sort
        Collections.sort(list);
        return list.get(k-1);
    }

    public static void main(String[] args) {
      int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};  
      int k = 8;

      System.out.println(" K th small in matrix : "+ kthSmallMatrix(matrix, k));
      System.out.println(" K th small in matrix naive : "+ kthSmall(matrix, k));
    }
}
