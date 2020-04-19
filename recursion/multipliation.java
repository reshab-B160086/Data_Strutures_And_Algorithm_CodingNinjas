/*Given two integers m & n, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.*/


public class solution {

    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here
        
        if (n == 1){
            return m;
        }
    
        return m + multiplyTwoIntegers(m,n-1);
    }
}
