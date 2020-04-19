//Check if a given String S is palindrome or not (using recursion). Return true or false.


public class solution {

    public static boolean isStringPalindrome(String input) {
        // Write your code here
        
        
       return isStringPalindrome(input,0,input.length()-1);

    }
    
    
    private static boolean isStringPalindrome(String input, int startIndex, int lastIndex){
        
        if (startIndex >= lastIndex){
            return true;
        }
        
        boolean ans = isStringPalindrome(input,startIndex + 1,lastIndex -1);
        if (ans == false){
            return false;
        }
        if (input.charAt(startIndex) == input.charAt(lastIndex)){
            return true;
        }
        else{
            return false;
        }
        
    }
}
