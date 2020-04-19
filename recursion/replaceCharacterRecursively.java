/*Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.*/


public class Solution {

    public static String replaceCharacter(String input, char c1, char c2) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
         if(input.length() == 0){
             return "";
         }
        
        
        String ans = replaceCharacter(input.substring(1),c1,c2);
        if (input.charAt(0) == c1){
            String s = c2 + ans;
            return s;
        }
        else{
            String s = input.charAt(0) + ans;
            return s;
        }
    }
}
