/*Given a string, find and print all the possible permutations of the input string.
Note : The order of permutations are not important. Just print them in different lines.*/

public class solution {

    public static void permutations(String input){
        // Write your code here
       
       permutations(input,"");
    }
    
    
    private static void permutations(String input,String output){
        
        if(input.length() == 0){
            System.out.println(output);
            return;
        }
        
        
        
        if(input.length() == 1){
            permutations(input.substring(1),output+input.charAt(0));
        }
        else{
            
            for(int i = 0;i < input.length();i++ ){
            String input1 = input.substring(0,i) + input.substring(i+1);    
            permutations(input1,output+input.charAt(i));
            }
            
        }

        
        
    }
}
