/*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.*/


public class Solution {

	public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
       if (x == 1 || n == 0){
           return 1;
       }
        
        if (n == 1){
            return x;
        }
        
        return x * power(x,n-1);
		
	}
}
