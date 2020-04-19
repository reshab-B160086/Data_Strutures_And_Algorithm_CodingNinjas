/*Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.*/


public class solution {

    public static int convertStringToInt(String input){
        // Write your code here
        
        
     return convertStringToInt(input,input.length()-1);
        
    }
    
    private static int convertStringToInt(String input, int index){
        
        if (input.length() == 1){
            return Integer.parseInt(input);
        }
        
        
        int ans = convertStringToInt(input.substring(1),index-1);
        
        String s = input.charAt(0) + "";
        
        int n =  Integer.parseInt(s);
        
            return (n * (int)Math.pow(10,index)) + ans;
        
    }
    
    
    
}
