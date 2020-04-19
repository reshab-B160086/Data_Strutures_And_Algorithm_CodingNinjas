//Given an integer n, count and return the number of zeros that are present in the given integer using recursion.


public class solution {

    public static int countZerosRec(int input){
        // Write your code here
        if ( input / 10 == 0 ){
            if (input == 0) 
               {
                return 1;
            }
            else{
                return 0;
            }
        }
        
        int ans = countZerosRec(input / 10);
        
        if(input % 10 == 0){
            ans += 1;
            return ans;
        }
        else{
            return ans;
        }
    }
}
