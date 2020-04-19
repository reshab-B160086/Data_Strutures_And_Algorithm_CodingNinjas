/*Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything.*/


public class Solution {
    
    public static void quickSort(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * No need to print or return the output.
         * Taking input and printing output is handled automatically.
         */
        
        quickSort(input,0,input.length-1);
        
    }
    
    private static void quickSort(int[] input, int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return;
        }
        
        int pivpos = pivotPos(input,startIndex,endIndex);
        quickSort(input,startIndex,pivpos-1);
        quickSort(input,pivpos+1,endIndex);
    }
    
    private static int pivotPos(int[] input, int startIndex, int endIndex){

        int count = 0;
        for(int i  = startIndex+1; i < endIndex+1;i++){
            if(input[i] <= input[startIndex]){
                count += 1;
            }
        }
        
        int pivpos = count + startIndex;
        
        int temp = input[pivpos];
        input[pivpos] = input[startIndex];
        input[startIndex] = temp;
        int i = startIndex;
        int j = endIndex;
        while(i < pivpos && j > pivpos){
                if(input[i] <= input[pivpos]){
                    i++;
                }
            else if(input[j] > input[pivpos]){
                j--;
            }
            else if(input[i] > input[pivpos]){
                temp = input[j];
                input[j] = input[i];
                input[i] = temp;
            }
            else if (input[j] < input[pivpos]){
                temp = input[j];
                input[j] = input[i];
                input[i] = temp;
            }
            
        }
        return pivpos;
    }
    
}