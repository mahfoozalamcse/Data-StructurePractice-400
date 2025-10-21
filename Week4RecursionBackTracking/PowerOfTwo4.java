package Week4RecursionBackTracking;
// 231. Power of Two
/*

Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1


Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16

 */
public class PowerOfTwo4 {
    // method 1
    public static boolean isPow(int n, int pow){
        if (n <= 0) {
            return false;
        }

        int res = (int) Math.pow(2, pow);
        if (res > n) {
            return false;
        }

        if (n == res) {
            return true;
        }
        return isPow(n, pow+1);
    }

    // approach 2
    public static boolean isPow2(int n){
        if (n <= 0) {
            return false;
        }
        return n > 0 && (n & (n-1)) == 0;
    }

    // approach 3
    public static boolean isPow3(int n){
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }
         return n == 1;
    }
    public static void main(String[] args) {
        int n = 16;

        System.out.println(" Result 1 : "+ isPow(n, 0));
        System.out.println(" Result 2 : "+ isPow2(n));
        System.out.println(" Result 3 : "+ isPow3(n));

        int s = 13;
        System.out.println(" Result 1 : "+ isPow(s, 0));
        System.out.println(" Result 2 : "+ isPow2(s));
        System.out.println(" Result 3 : "+ isPow3(s));
    }
}
