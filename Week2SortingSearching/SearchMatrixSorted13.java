package Week2SortingSearching;
// 240. Search a 2D Matrix II
/*


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true

Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false



 */
public class SearchMatrixSorted13 {
  public static boolean searchMatrix(int[][] matrix, int target){
     int rows = matrix.length;
     int cols = matrix[0].length;

     int row=0;
    
     int col = cols-1;

     while (row < rows && col >= 0) {
        int current = matrix[row][col];
       

        if (current == target) {
            return true;
        }
        else if (current > target) {
            col--;
        }else{
            row++;
        }
     }

     return false;
  }
  public static void main(String[] args) {
    int[][] matrix = {{1,4,7,11,15},
                      {2,5,8,12,19}, 
                      {3,6,9,16,22},
                      {10,13,14,17,24},
                      {18,21,23,26,30}};
    int target = 19;

    System.out.println(" Search matrix data : "+ searchMatrix(matrix, target));
  }  
}
