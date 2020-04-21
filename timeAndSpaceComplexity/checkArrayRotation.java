/*Given an integer array, which is sorted (in increasing order) and has been rotated by some number k in clockwise direction. Find and return the k.*/


import java.util.Arrays;
public class CheckRotation {    

    public static int arrayRotateCheck(int[] arr){
        /* Your class should be named CheckRotation
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return arrayRotateCheck(arr,0);

    }
    
    
    private static int arrayRotateCheck(int[] arr, int k){
    
          if(isSorted(arr)){
              return k;
          }   
        
        rotate(arr);
        int ans = arrayRotateCheck(arr,k+1);
        
        return ans;
    }
    
    private static void rotate(int[] arr){
        int temp = arr[0];
        for(int i =1;i < arr.length;i++){
            arr[i-1] = arr[i];
        }
        
        arr[arr.length-1] = temp;
    }
    
    private static boolean isSorted(int[] arr){
        
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        
        return true;
        
    }
    
    
}