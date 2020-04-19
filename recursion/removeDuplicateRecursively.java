//Given a string S, remove consecutive duplicates from it recursively.

public class Solution {

    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
      if(s.length() == 0){
          return "";
      }
        
        
        String temp = removeConsecutiveDuplicates(s.substring(1));
        if(temp == ""){
            String ans = s.charAt(0) + temp;
            return ans;
        }
        if(s.charAt(0) == temp.charAt(0)){
            return temp;
        }
        else{
            String ans = s.charAt(0) + temp;
            return ans;
        }
        
    }

}