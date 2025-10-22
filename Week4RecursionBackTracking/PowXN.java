package Week4RecursionBackTracking;
// 50. Pow(x, n)
/*
Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */
public class PowXN {
    public static double myPow(double x, int n) {
        // double result = Math.pow(x, n);
        // return result;

        // log(n) time
        long exp = n;

        // handle negative
        if(exp < 0){
            x = 1 / x;
            exp = -exp;
        }

        double res = 1.0;
        double curr = x;

        // binary exponentiation approch
        while(exp > 0){
            if((exp % 2) == 1){ // odd case
                res *= curr;
                
            }

            curr *= curr; // for even case
            exp /= 2;
        }

        return res;
    }

    // solve using Recursion and back track 
    public static void main(String[] args) {
        
    }
}
