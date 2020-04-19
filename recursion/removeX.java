//Given a string, compute recursively a new string where all 'x' chars have been removed.


public class solution {

    // Return the changed string
    public static String removeX(String input){
        // Write your code here
        if (input.length() == 0){
           return input;
        }          
      
        
        
        String temp = removeX(input.substring(1));
    
        if (input.charAt(0) == 'x'){
                return temp;
        }
        String s = input.charAt(0) + temp;
        return s;
        
}
}
    

