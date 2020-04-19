/*Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print them in different lines.
Input format :*/

public class solution {
    public static void printSubsetsSumTok(int input[], int k) {
        // Write your code here
       int[] output = new int[0];
       printSubsetsSumTok(input,k,0,output);    
    }
    
    private static void printSubsetsSumTok(int[] input,int k,int startIndex,int[] output){
        if(startIndex == input.length){
            if(k==0){
                for(int i =0;i<output.length;i++){
                    System.out.print(output[i] + " ");
                }
                System.out.println();
                return;
            }
        
            else{
                return;
            }
          
        }
        
        
        
        
        int[] newoutput = new int[output.length+1];
        
        int k1 =0;
        for(int i = 0;i<output.length;i++){
            newoutput[k1] = output[i];
            k1+=1;
        }
        newoutput[k1] = input[startIndex];
        
                printSubsetsSumTok(input,k-input[startIndex],startIndex+1,newoutput);
        printSubsetsSumTok(input,k,startIndex+1,output);

    }
}


