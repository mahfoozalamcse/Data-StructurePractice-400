package Week4RecursionBackTracking;
// Print N to 1 without loop
/*
Input:
N = 10
Output: 10 9 8 7 6 5 4 3 2 1

 */
public class PrintNto1withoutloop5 {
    public static void printNos(int N) {
        // code here
        if(N == 0){
            return;
        }
        
        System.out.print(N+" ");
        printNos(N-1);
    }
    public static void main(String[] args) {
       int n = 10;
       printNos(n);
    }
}
