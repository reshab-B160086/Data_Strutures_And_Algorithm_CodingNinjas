/*Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.*/


public class Solution {

    public static int[] allIndexes(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
        */
        
//        int all[] = new int[input.length];
        
        return allIndexes(input,x,0);
        
    }
    
    private static int[] allIndexes(int input[],int x, int startIndex){
        
        if(startIndex == input.length){
            int a[] = new int[0];
            return a;}
        
        int smallanswer[] =  allIndexes(input,x,startIndex + 1);
        
        if(smallanswer.length != 0 ){
            if(input[startIndex] == x){
             int a[] = new int[smallanswer.length + 1];
            a[0] = startIndex;
            for(int i = 1; i <= smallanswer.length;i++){
                a[i] = smallanswer[i-1];
            }
                return a;
            }
            return smallanswer;
            
        }
        if(input[startIndex] == x){
            int a[] = new int[smallanswer.length + 1];
            a[0] = startIndex;
            for(int i = 1; i <= smallanswer.length;i++){
                a[i] = smallanswer[i-1];
            }
            return a;
        }
        else{
            int a[] = new int[0];
            return a;
        }
        
        
        
    }
    
}