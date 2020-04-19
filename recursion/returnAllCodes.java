/*Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. And input string does not contain 0s.
Input format :*/


public class solution {

    // Return a string array that contains all possible codes
    public static  String[] getCode(String input){
        // Write your code here
       //String[] s = new String[0];
       return getCode(input,"");   
        
    }
    
    
    private static String[] getCode(String input,String output){
        
        if(input.length() == 0){
            String[] s = new String[1];
            s[0] = output;
            return s;
        }
        
        
        String[] s1 = getCode(input.substring(1),output + helper(input.charAt(0) + ""));
        if(input.length() >= 2 && Integer.parseInt(input.substring(0,2)) <= 26){

            String[] s2 = getCode(input.substring(2),output+ helper(input.substring(0,2)));
            
            String[] ans = new String[s1.length + s2.length];
            int k = 0;
            for(int i = 0;i <s1.length;i++){
                ans[k] = s1[i];
                k+= 1;
            }
            for(int i = 0;i<s2.length;i++){
                ans[k] = s2[i];
                k+=1;
            }
            
            return ans;
        }
        else{
            return s1;
        }
        
    }
        

    
    
    private static String helper(String s){
        
        String[] arr = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int n = Integer.parseInt(s);
        
        return arr[n-1];
    }

}
