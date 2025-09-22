package Assighnment2;

import java.util.ArrayList;
import java.util.Collections;

// Leet code 378 Kth Smallest Element in a Sorted Matrix
public class KthMatrix10 {

    // approch 1

    public int kthSmallest(int[][] matrix, int k) {
      int n = matrix.length;

      ArrayList<Integer> list = new ArrayList<>();
      // step 1 add in list
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            list.add(matrix[i][j]);
        }
      }   

      // step 2 sort list
      Collections.sort(list);

      // step 3 return kth element
      return list.get(k-1);

    }

    // approach 2
    public int kthSmallest2(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int heigh = matrix[n-1][n-1];

        while (low < heigh) {
            int mid = low + (heigh - low)/2;

            int count = countLessEqual(matrix, mid);

            if (count < k) {
                low = mid + 1;
            }else{
                heigh = mid;
            }
        }

        return low;
    }

    private int countLessEqual(int matrix[][], int mid){
        int n = matrix.length;
        int count = 0;
        int row = n-1, col = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                count += row + 1;
                col++;
            }else{
                row--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
    }
}
