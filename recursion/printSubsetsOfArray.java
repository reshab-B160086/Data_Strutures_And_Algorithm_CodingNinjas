/*Given an integer array (of length n), find and print all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print the subsets in different lines.
Input format :*/

public class solution {
    public static void printSubsets(int input[]) {
        // Write your code here
       int[] arr = new int[0];
       printSubsets(input,0,arr);
    }
    
    private static void printSubsets(int[] input,int startIndex,int[] output){
        
        if(startIndex == input.length){
            for(int i = 0;i < output.length;i++){
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }
        
        
        printSubsets(input,startIndex+1,output);
        int i;
        int[] newoutput = new int[output.length + 1];
        for(i = 0;i < output.length;i++){
            newoutput[i] = output[i];
        }
        
        newoutput[i] = input[startIndex];
        
        printSubsets(input,startIndex+1,newoutput);
            
        
        
    }
}
