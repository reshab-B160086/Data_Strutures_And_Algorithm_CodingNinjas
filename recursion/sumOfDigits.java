//Write a recursive function that returns the sum of the digits of a given integer.


public class solution {

    public static int sumOfDigits(int input){
        // Write your code here
        if (input / 10 == 0){
            return input;
        }
        return sumOfDigits(input /10 ) + input % 10;

    }
}
