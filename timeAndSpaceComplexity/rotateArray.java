/*Given a random integer array of size n, write a function that rotates the given array by d elements (towards left)
Change in the input array itself. You don't need to return or print elements.*/


public class ArrayRotate {  

    public static void rotate(int[] arr, int d) {
        /* Your class should be named ArrayRotate
         * Don't write main().
             * Don't read input, it is passed as function argument.
             * No need to print or return the output.
             * Taking input and printing the output is handled automatically.
             */
        
        while(d >= arr.length){
            d = d-arr.length;
        }

        int[] t = new int[d];
        
        for(int i =0;i<d;i++){
                t[i] = arr[i]; 
        }
        
        int k =0;
        for(int i = d;i<arr.length;i++){
            arr[k] = arr[i];
            k+=1;
        }
        
        for(int i =0;i<d;i++){
            arr[k] = t[i];
            k+=1;
        }
        
        
        
    }
}