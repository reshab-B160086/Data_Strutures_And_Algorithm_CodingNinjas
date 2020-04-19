/*Given an array A of size n and an integer K, return all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :*/

public class solution {

    // Return a 2D array that contains all the subsets which sum to k
    public static int[][] subsetsSumK(int input[], int k) {
        // Write your code here

        return subsetsSumK(input,0,k);

    }
    
    
    private static int[][] subsetsSumK(int[] input,int startIndex, int k){
        
        if(startIndex == input.length){
            if(k == 0){
                int[][] arr = new int[1][0];
                return arr;
            }
            else{
                int[][] arr = new int[0][0];
                return arr;
            }
        }
        if(k < 0){
            return new int[0][0];
        }
        
        int[][] temp1 = subsetsSumK(input,startIndex + 1,k-input[startIndex]);
        int[][] temp2 = subsetsSumK(input,startIndex + 1,k);
        
        int[][] ans = new int[temp1.length + temp2.length][];
        
        int k1 = 0;
        
        for(int i = 0 ;i <temp1.length;i++){
            ans[k1] = new int[temp1[i].length + 1];
            ans[k1][0] = input[startIndex];
            for(int j = 0;j < temp1[i].length;j++){
                ans[k1][j+1] = temp1[i][j];
            }
            k1 += 1; 
        }
            
        for(int i = 0;i<temp2.length;i++){
                ans[k1] = temp2[i];
            k1 += 1;
        }
        
        return ans;
    }
}
