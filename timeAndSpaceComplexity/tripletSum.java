/*Given a random integer array and a number x. Find and print the triplets of elements in the array which sum to x.
While printing a triplet, print the smallest element first.
That is, if a valid triplet is (6, 5, 10) print "5 6 10". There is no constraint that out of 5 triplets which have to be printed on 1st line. You can print triplets in any order, just be careful about the order of elements in a triplet.*/


import java.util.Arrays;

public class TripletSum {   


    public static void FindTriplet(int[] arr, int x){
        /* Your class should be named TripletSum.
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
     Arrays.sort(arr);
     
        for(int i =0;i<arr.length;i++){
              int flag = 0;
              int p = i+1;
              int q = arr.length-1;
            while(p<q){
                  
                if((arr[i]+arr[p]+arr[q]) < x){
                    p++;
                }
                else if((arr[i]+arr[p]+arr[q]) > x){
                    q--;
                }
                
                else{
                   int count1=0,count2=0;
                   
                   for(int ptr = p;ptr<=q;ptr++){
                       if(arr[p] == arr[ptr])
                           count1++;
                       else
                           break;
                   }
                    
                   for(int ptr = q;ptr>=p;ptr--){
                       if(arr[q] == arr[ptr])
                           count2++;
                       else
                           break;
                   }
                    
                    int combinations = count1 * count2;
                    
                    if(arr[p] == arr[q])
                        combinations = ((q-p+1)*(q-p))/2;
                    for(int c = 0;c<combinations;c++){
                        System.out.println(arr[i]+" "+arr[p]+" "+arr[q]);
                    }
                    
                    p = p+count1;
                    q = q-count2;
                    
                }
                
            }
       
        }
        
    }
}