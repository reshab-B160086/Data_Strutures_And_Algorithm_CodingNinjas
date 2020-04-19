
/*Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.*/



public class solution {

    // Return a string array that contains all the possible strings
    public static String[] keypad(int n){
        // Write your code here
     if(n==0){
         String[] s = {""};
         return s;
     }
        
        String[] temp = keypad(n/10);
        String[] small = helper(n%10);
        String[] ans = new String[temp.length * small.length];
        
        int j  = 0;
        int i  = 0;
            while( j < small.length ){
                for(int k = 0;k < temp.length;k++){
                    ans[i++] = temp[k] + small[j];
                }
                j++;
            }
        return ans;
        
        
    }
    
    
    private static String[] helper(int n){
        if (n == 2){
            String[] s = {"a","b","c"};
            return s;
        }
        else if(n == 3){
             String[] s = {"d","e","f"};
            return s;
        }
        else if(n == 4){
             String[] s = {"g","h","i"};
            return s;
        }
        else if(n == 5){
             String[] s = {"j","k","l"};
            return s;
        }
        else if(n == 6){
             String[] s = {"m","n","o"};
            return s;
        }
        else if(n == 7){
             String[] s = {"p","q","r","s"};
            return s;
        }
        else if(n == 8){
             String[] s = {"t","u","v"};
            return s;
        }
        else{
             String[] s = {"w","x","y","z"};
            return s;
        }
    }
    
}
