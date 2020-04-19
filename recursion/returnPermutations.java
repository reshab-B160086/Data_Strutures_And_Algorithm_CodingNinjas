/*Given a string S, find and return all the possible permutations of the input string.
Note 1 : The order of permutations is not important.
Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
Input Format :*/

public class solution {
    
    public static String[] permutationOfString(String input){
        // Write your code here
        if(input.length() == 0){
            String[] s = new String[1];
            s[0] = "";
            return s;
        }
        
        
        String[] temp1 = permutationOfString(input.substring(1));
        
        String[] ans = new String[temp1.length * (temp1[0].length()+1)];
        int k = 0;
        for(int i =0 ;i < temp1.length; i++){
            
            
            if(temp1[i].length() == 0){
                ans[k] = input.charAt(0) +"";
                break;
            }
            
            else{
                ans[k++] = input.charAt(0) + temp1[i];
                ans[k++] = temp1[i] + input.charAt(0);
                for(int j = 1 ;j <temp1[i].length();j++){
                 ans[k++] = temp1[i].substring(0,j) + input.charAt(0) + temp1[i].substring(j);
                }
            }
            
            
        }
        
        return ans;
        
        
        
        
        
        
        
        
    }
    
}
