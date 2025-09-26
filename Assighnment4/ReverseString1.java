package Assighnment4;
// Leetcode 344. Reverse String

public class ReverseString1 {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ReverseString1 reverseString1 = new ReverseString1();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString1.reverseString(s);
        System.out.println(s); // Output: "olleh"
    }
}
