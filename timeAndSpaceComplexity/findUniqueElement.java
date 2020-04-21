/*Given an integer array of size 2N + 1. In this given array, N numbers are present twice and one number is present only once in the array.
You need to find and return that number which is unique in the array.
Note : Given array will always contain odd number of elements.
Input format :*/

public class FindUnique{    

    public static int findUnique(int[] arr){
        /* Your class should be named FindUnique
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

       int max = arr[0];
        
        for(int i =1 ;i<arr.length;i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        
        int[] t = new int[max];
        
        
        for(int i = 0;i<arr.length;i++){
            t[arr[i]-1] += 1;
        }
        
        int k =0;
        while(t[k] != 1){
            k++;
        }
        
        return k+1;
        
        
    }
}