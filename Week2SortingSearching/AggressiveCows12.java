package Week2SortingSearching;

import java.util.Arrays;

/* 

// GFG Aggressive Cows
Input: stalls[] = [1, 2, 4, 8, 9], k = 3
Output: 3
Input: stalls[] = [10, 1, 2, 7, 5], k = 3
Output: 4
Input: stalls[] = [2, 12, 11, 3, 26, 7], k = 5
Output: 1


*/
public class AggressiveCows12 {
    public static boolean canPlace(int[] stalls, int k, int dist){
        int count = 1;
        int lastPos = stalls[0];

        for(int i=1; i<stalls.length; i++){

            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];
            }

            if (count == k) {
                return true; // all cows fix
            }
        }

        return false; // can not place all cows

    }

    public static int maxDistance(int stalls[], int k){
      Arrays.sort(stalls);

      int low = 1;
      int high = stalls[stalls.length-1] - stalls[0];
      int ans = 0;

      while (low <= high) {
          int mid = low + (high - low) / 2;

          if (canPlace(stalls, k, mid)) {
             ans = mid;
             low = mid + 1;
          }else{
             high = mid - 1;
          }
      }

      return ans;
    }
    
   public static void main(String[] args) {
    int[] stalls = {1, 2, 4, 8, 9};
    int k = 3;

    System.out.println("Maximum minimum distance: " + maxDistance(stalls, k));
   } 
}
