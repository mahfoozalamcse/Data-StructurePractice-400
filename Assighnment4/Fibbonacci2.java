package Assighnment4;
// Leetcode 509. Fibonacci Number

public class Fibbonacci2 {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
        
    }
    public static void main(String[] args) {
        Fibbonacci2 fibbonacci2 = new Fibbonacci2();
        int n = 5;
        int result = fibbonacci2.fib(n);
        System.out.println(result); // Output: 5
    }
}
