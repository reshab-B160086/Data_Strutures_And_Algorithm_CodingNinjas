/*Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.*/

public class Solution {
    
    public static boolean checkNumber(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
        */
        
        if(input.length ==1){
            if (input[0] == x){
                return true;
            }else{
                return false;
            }
        }
        int smallinput[] = new int[input.length - 1];
        for(int i = 1; i < input.length; i++){
            smallinput[i-1] = input[i];
        }
        boolean ans = checkNumber(smallinput,x);
        
        if(ans){
            return true;
        }
        else if(input[0] == x){
            return true;
        }
        else{
            return false;
        }
        
    }
}