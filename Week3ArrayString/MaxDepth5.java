package Week3ArrayString;

import java.util.Stack;

public class MaxDepth5 {
     public static int maxDepth(String s) {
    
       int dp=0;
       int count =0;

       for(int i=0; i<s.length(); i++){
          if(s.charAt(i) == '('){
            count++;

            dp = Math.max(dp , count);
          }else if(s.charAt(i) == ')'){
            
             count--;
          }
       }
     return dp;  

    }

    // approach 2 using stack
    public static int maxDepth1(String s){
        Stack<Character> st = new Stack<>();
        
        int maxDep = 0;

        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));

                maxDep = Math.max(maxDep, st.size());
            }
            else if (s.charAt(i) == ')') {
                st.pop();
            }
        }

        return maxDep;
    }
    
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(" Length of nested : "+ maxDepth(s));

        System.out.println(" Length of nested : "+ maxDepth1(s));
    }
}
