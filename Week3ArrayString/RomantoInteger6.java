package Week3ArrayString;

import java.util.HashMap;
import java.util.Map;

//Leet code 13. Roman to Integer
/*
  Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000


Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 */
public class RomantoInteger6 {
    public static int romanToInt(String s){
        
        Map<Character, Integer> romanValue = new HashMap<>();
        romanValue.put('I', 1);
        romanValue.put('V', 5);
        romanValue.put('X', 10);
        romanValue.put('L', 50);
        romanValue.put('C', 100);
        romanValue.put('D', 500);
        romanValue.put('M', 1000);

        int result = 0;
        int n = s.length();

        for(int i=0; i<n; i++){
           int currentValue = romanValue.get(s.charAt(i));

           // if next greater than use for substraction
           if (i+1 < n) {
              int nexGreater = romanValue.get(s.charAt(i+1));

              if (currentValue < nexGreater) {
                  result += (nexGreater - currentValue);
                  i++; // skip next alredy process
              }else{
                  result += currentValue;
              }
           }else{
              result += currentValue;
           }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(" Roman to Integer : "+ romanToInt(s));
    }
}
