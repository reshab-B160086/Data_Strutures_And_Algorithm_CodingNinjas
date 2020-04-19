/*Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".*/


public class solution {

    // Return the updated string
    public static String addStars(String s) {
        // Write your code here
          if(s.length() == 1){
              return s;
          }
        
        String temp = addStars(s.substring(1));
        
        if (s.charAt(0) == temp.charAt(0)){
            String ans = s.charAt(0) + "*" + temp;
            return ans;
        }
        
        else {
            String ans = s.charAt(0) + temp;
            return ans;
        }
    }
}
