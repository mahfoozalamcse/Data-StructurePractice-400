package Week2SortingSearching;
// 668. Kth Smallest Number in Multiplication Table
/*
Input: m = 3, n = 3, k = 5
Output: 3
Explanation: The 5th smallest number is 3.


 */
public class KthSmallestNum21 {
    public static int kthSmall(int m, int n, int k){
        int low = 1;
        int high = m*n;

        while (low < high) {
            int mid = low+(high-low)/2;
  
            int count = countLessEqual(mid, m, n);

            if (count < k) {
                low = mid+1;
            }else{
                high = mid;
            }

        }

        return low;
    }

    // helper method
    public static int countLessEqual(int x, int m, int n){
        int count = 0;
        for(int i=1; i<=m; i++){
            count+= Math.min(n, x/i);
        }

        return count;
    }
    public static void main(String[] args) {
       int m = 3, n = 3, k = 5;
       System.out.println("  Kth small : "+ kthSmall(m, n, k));
       
    }
}
