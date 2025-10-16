package Week2SortingSearching;
// 1201. Ugly Number III

public class UglyNumberIII14 {
    // gcd
    public static long gcd(long a, long b){
       if (b == 0) {
         return a;
       }

       return gcd(b, a % b);
    }

    public static long lcm(long a, long b){
        return (a / gcd(a, b)) * b;
    }

    public static long countUglyNumber(long x, long a, long b, long c){
       long ab = lcm(a, b);
       long bc = lcm(b, c);
       long ac = lcm(a, c);
       long abc = lcm(a, bc);

       // inclusion and exclusion principle
       return (x / a) + (x / b) + (x / c)
              - (x/ab) - (x/bc) - (x/ac)
              + (x/abc);
      
    }

    // serach and find nth ugly number
    public static long  nthUglyNumber(long n, long a, long b, long c){
        long low = 1, high = (long)2e9;
       

        while (low < high) {
          long mid = low + (high - low)/2;
          long count = countUglyNumber(mid, a, b, c);

          if (count < n) {
            low = mid + 1; // right half exist not enough range of ugly no.
          }else{
            high = mid;
          }
        }

        return low;
    }

    public static void main(String[] args) {
        long n = 4, a = 2, b = 3, c = 4;
        System.out.println("Nth Ugly Number: " + nthUglyNumber(n, a, b, c)); 
    }
    
}
