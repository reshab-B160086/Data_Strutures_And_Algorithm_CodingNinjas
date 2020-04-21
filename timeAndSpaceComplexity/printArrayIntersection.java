/*Given two random integer arrays, print their intersection. That is, print all the elements that are present in both the given arrays.
Input arrays can contain duplicate elements.
Note : Order of elements are not important
Input format :*/

import java.util.Arrays;

public class Intersection{
    
    public static void intersection(int[] arr1, int[] arr2){
        /* Your class should be named Intersection
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
          Arrays.sort(arr1);
          Arrays.sort(arr2);
          
          
         // int l = Math.min(arr1.length,arr2.length);
        
          int j = 0,i=0;
          
        
          while(i < arr1.length && j < arr2.length){
              if(arr1[i] == arr2[j]){
                  System.out.println(arr1[i]);
                  i++;
                  j++;
              }
              else if (arr1[i] < arr2[j]){
                  i++;
              }
              else{
                  j++;
              }
              
          }
        
    }
}