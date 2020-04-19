/*Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :

Line 1 : Size of array

Line 2 : Array elements (separated by space)

*/

public class solution {

    // Return a 2D array that contains all the subsets
    public static int[][] subsets(int input[]) {
        // Write your code here
          return subsets(input,0);
    }
    
    private static int[][] subsets(int[] input, int startIndex){
        if(startIndex > input.length-1){
            int[][] ar = new int[1][];
            ar[0] = new int[0];
            return ar;
        }
        
        int[][] smallans = subsets(input,startIndex+1);
        int[][] arr = new int[smallans.length * 2][];
        
        int k =0;
        for(int i = 0 ;i < smallans.length;i++){
            arr[k++] = new int[smallans[i].length];
        }
        
        for(int i = 0;i<smallans.length;i++){
            arr[k++] = new int[smallans[i].length+1];
        }
        k = 0;
        for(int i = 0 ;i < smallans.length;i++){
            for(int j = 0;j < smallans[i].length;j++){
                arr[k][j] = smallans[i][j];
            }
            k += 1;
        }
        
        for(int i = k ; i < arr.length;i++ ){
                arr[i][0] = input[startIndex];
            }
        
        // for(int i = k ; i <arr.length;i++){
        //     for(int j = 1;i < arr[i].length;j++){
        //         arr[i][j] = smallans[i-k][j-1];
        //     }
        // }
           
        for(int i = 0 ;i < smallans.length;i++){
            for(int j = 0;j < smallans[i].length;j++){
                arr[k][j+1] = smallans[i][j];
            }
            k += 1;
        }
        
        return arr;
        }
        
    }

