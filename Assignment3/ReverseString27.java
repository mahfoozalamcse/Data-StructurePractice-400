package Assignment3;

public class ReverseString27 {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces and split the string by spaces
        String[] words = s.trim().split("\\s+");

        // Use a StringBuilder to concatenate the words in reverse order
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        ReverseString27 reverseString27 = new ReverseString27();
        String s = "  hello world  ";
        String result = reverseString27.reverseWords(s);
        System.out.println(result); // Output: "world hello"
    }
}
