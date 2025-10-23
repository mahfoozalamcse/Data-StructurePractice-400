package Week3ArrayString;

import java.util.Arrays;

public class IsomorphicStrings7 {
    public static boolean isIsomorphic(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }

        int mapST[] = new int[256];
        int mapTS[] = new int[256];

        Arrays.fill(mapST, -1);
        Arrays.fill(mapTS, -1);

        for(int i=0; i<s.length(); i++){
          char c1 = s.charAt(i);
          char c2 = t.charAt(i);

          // if c1 is already map
          if (mapST[c1] != -1 ) {
              if (mapST[c1] != c2) {
                return false; // in consitent maping..
              }
          }else{
                mapST[c1] = c2; // assign map
            }

          // check reverse maping
          if (mapTS[c2] != -1) {
            if (mapTS[c2] != c1) {
                return false; // inconsitant reverse map
            }
          }else{
                mapTS[c2] = c1; // assign map
            }
        }

        return true; // All map consistantaly
    }
    public static void isIsomorphic2(){
        
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
        System.out.println(isIsomorphic("paper", "title")); // true
    }
}
