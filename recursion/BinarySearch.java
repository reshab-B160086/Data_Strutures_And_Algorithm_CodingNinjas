/*Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array.
Note : If given array size is even, take first mid.
Input format :

Line 1 : Array size

Line 2 : Array elements (separated by space)

Line 3 : x (element to be searched)*/

public class solution {

    // element - number to be searched
    public static int binarySearch(int input[], int element) {
        // Write your code here
      return binarySearch(input,element,0,input.length-1); 

    }
    
    private static int binarySearch(int[] input,int element, int startIndex, int endIndex){
        if(startIndex > input.length){
            return -1;
        }
        if(endIndex < 0){
            return -1;
        }
        
        if(endIndex == startIndex){
            if(input[startIndex] == element){
                return startIndex;
            }
            else{
                return -1;
            }
        }
        
        
        int mid =startIndex + (endIndex - startIndex) / 2 ;
        
        if(element == input[mid]){
            return mid;
        }
        
        else if(element < input[mid]){
            return binarySearch(input,element,startIndex,mid-1);
        }
        
        else{
            return binarySearch(input,element,mid+1,endIndex);
        }
        
        
        
        
        
        
    }
    
}
