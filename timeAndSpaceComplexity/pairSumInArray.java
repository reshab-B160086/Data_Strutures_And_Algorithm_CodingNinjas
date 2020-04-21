/*Given a random integer array A and a number x. Find and print the pair of elements in the array which sum to x.
Array A can contain duplicate elements.
While printing a pair, print the smaller element first.
That is, if a valid pair is (6, 5) print "5 6". There is no constraint that out of 5 pairs which have to be printed in 1st line. You can print pairs in any order, just be careful about the order of elements in a pair.*/

import java.util.Arrays;

public class PairSum{   

    public static void pairSum(int[] arr, int num){
        /* Your class should be named PairSum
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
         int i =0,j = arr.length-1;
         int flag = 0;
         Arrays.sort(arr);        
        
         while(i < j){
             
             if((arr[i]+arr[j]) == num){
                
                 int k1=i,k2=j;
                 int c1 = 0,c2 = 0;
                 while(k1 != k2 && arr[i] == arr[k1]){
                     k1++;
                     c1++;
                 }
                 
                 if(k1 == k2 && arr[i] == arr[k2]){
                     for(int l = 0;l < (c1+1)*(c1)/2;l++){
                         System.out.println(arr[i] + " "+arr[j]);
                     }
                     break;
                 }
                 else{
                     while(k2 != k1 && arr[k2] == arr[j]){
                         k2--;
                         c2++;
                     }
                     for(int l = 0;l < c1*c2;l++){
                         System.out.println(arr[i] + " " + arr[j]);
                     }
                     i = k1;
                     j = k2;
                 }
                 
             }
             else if((arr[i]+arr[j]) < num){
                 i++;
             }
             else{
                 j--;
             }
         }   
         
    }
}