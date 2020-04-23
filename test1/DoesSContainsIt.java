/*Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
Return true or false.
Do it recursively.
E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.*/


public class Solution {
    public static boolean checkSequence(String a, String b) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
          if(b.length() == 0){
              return true;
          }else if(a.length() == 0 && b.length() !=0){
              return false;
          }
        else if(a.length() == b.length() && a == b){
            return true; 
        }else if(a.length() == b.length() && a!=b){
            return false;
        }
        
          char c = b.charAt(0);
        int i=0,flag=0;
        for(i =0;i<a.length()-1;i++){
            if(c == a.charAt(i)){
                flag = 1;
                break;
            }
        }
        
        if(flag == 0){
            return false;
        }
        
        boolean ans = checkSequence(a.substring(i+1),b.substring(1));
        return ans;
        
        
        
    }
}