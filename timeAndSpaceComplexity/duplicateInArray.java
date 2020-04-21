/*Given an array of integers of size n which contains numbers from 0 to n - 2. Each number is present at least once. That is, if n = 5, numbers from 0 to 3 is present in the given array at least once and one number is present twice. You need to find and return that duplicate number present in the array.
Assume, duplicate number is always present in the array.*/

public class DuplicateInArray{  

    public static int duplicate(int[] arr){  
        /* Your class should be named DuplicateInArray
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        
        int[] n = new int[arr.length-1];
        int c = 0;
        
        for(int i = 0 ;i<arr.length;i++){
            n[arr[i]] += 1;
            if(n[arr[i]] > 1){
                c = arr[i];
                break;
            }
        }
        
        return c;
    }
}