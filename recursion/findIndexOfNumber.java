/*Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.*/


public class Solution {

    public static int firstIndex(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
        */
        
        int ans  = firstIndex(input,x,0);
        return ans;
    }
    
    
    private static int firstIndex(int input[],int x, int startIndex){
        
        if (input[startIndex] == x ){
            return startIndex;
        }
        if (startIndex == input.length - 1){
            return -1;
        }
        
        int ans = firstIndex(input,x,startIndex + 1);
        return ans;
        
        
        
    }
    
}