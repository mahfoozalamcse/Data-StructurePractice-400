package Week4RecursionBackTracking;
//Leet code 344. Reverse String
/*
 Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */


public class ReverseString1 {
    // naive 
    public static void reverseString(char[] s){
        char[] temp = new char[s.length];

        for(int i=s.length-1,  j=0; i>=0; i--, j++){
            temp[j] = s[i];
           
        }
       
        
        for(int i=0; i<temp.length; i++){
            s[i] = temp[i];
        }
    }

    public static void printArr(char[] s){
       for(int i=0; i<s.length; i++){
          System.out.print(s[i]+" ");
       }
       System.out.println();
    }

    // approach 2
    public static void reverseString2(char[] s){
        int start = 0;
        int end = s.length-1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

    // approch 3 using recursion
    public static void reverseString3(char[] s, int start, int end){
        if (start >= end) {
            return;
        }
        // swap
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverseString3(s, start+1, end-1);
    }
    public static void main(String[] args) {
        char s[] = {'h','e','l','l','o'};
        // printArr(s);
        // reverseString(s);
        // reverseString2(s);
        reverseString3(s, 0, s.length-1);
        printArr(s);

    }
}
