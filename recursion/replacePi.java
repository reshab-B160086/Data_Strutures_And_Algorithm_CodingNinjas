/*Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".*/

public class solution {

    // Return the changed string
    public static String replace(String input){
        // Write your code here
        
        if (input.length() <=1){
            return input;
        }
          
         String temp = replace(input.substring(1));
        
         if (input.charAt(0) == 'p' && temp.charAt(0) == 'i'){
             return "3.14" + temp.substring(1);
         }
         String s = input.charAt(0) + temp;
        return s;
    }
    
   
}
