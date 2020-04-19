/*Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
Note : The order of strings are not important. Just print different strings in new lines.
Input Format :*/

public class solution {

    public static void printKeypad(int input){
        // Write your code here
        printKeypad(input,"");
    }
    
    private static void printKeypad(int input,String output){
        if(input == 0){
            System.out.println(output);
            return;
        }
        
        String[] d = helper(input % 10);
        
        if(d.length == 3){
            printKeypad(input/10,d[0]+output);
            printKeypad(input/10,d[1]+output);
            printKeypad(input/10,d[2]+output);
        }   
        else{
            printKeypad(input/10,d[0]+output);
            printKeypad(input/10,d[1]+output);
            printKeypad(input/10,d[2]+output);
            printKeypad(input/10,d[3]+output);
        }
        
    }
    
    
    private static String[] helper(int n){
        if(n==2){
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
