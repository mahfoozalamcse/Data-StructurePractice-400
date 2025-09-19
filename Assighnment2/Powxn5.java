package Assighnment2;

public class Powxn5 {
    // Leet code 50. Pow(x, n)
    public static double myPow(double x, int n) {

        // double result = Math.pow(x, n);
        // return result;

        // log(n) time
        long exp = n;

        // handle negative
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double res = 1.0;
        double curr = x;

        // binary exponentiation approch
        while (exp > 0) {
            if ((exp % 2) == 1) { // odd case
                res *= curr;

            }

            curr *= curr; // for even case
            exp /= 2;
        }

        return res;
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(" My pow x of n : "+ myPow(x, n));
    }
}
