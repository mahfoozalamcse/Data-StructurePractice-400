package Week2SortingSearching;

/* 

// Leet code  50. Pow(x, n)
Input: x = 2.00000, n = 10
Output: 1024.00000

Input: x = 2.10000, n = 3
Output: 9.26100

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2^-2 = 1/2*2 = 1/4 = 0.25

*/

public class PowXN5 {
    public static double powResult(double x, int n){

        /*
         * simple ans  using inbuild method
         * 
         * double ans = Math.pow(x, n);
         * return ans;
         */
       long exp = n;

       if (exp < 0) {
          x = 1/x;
          exp = -exp;
       }
       double curr = x;
       double res = 1.0;
 
       // binary expontiation
       while (exp > 0) {
          if ((exp % 2) == 1) { // odd case
             res *= curr;
          }

          curr *= curr; // even case
          exp /= 2;

       }

       return res;

    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(" Result : "+ powResult(x, n));
    }
}
