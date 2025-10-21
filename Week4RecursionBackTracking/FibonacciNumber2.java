package Week4RecursionBackTracking;
// 509. Fibonacci Number
/*
Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.


Example 2:
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

 */
public class FibonacciNumber2 {
    public static int fibonacci(int n){
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(" Fibonacci : "+ fibonacci(n));
    }
}
