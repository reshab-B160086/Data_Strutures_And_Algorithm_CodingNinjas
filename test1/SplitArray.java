/*Given an integer array A of size N, check if the input array can be splitted in two parts such that -
- Sum of both parts is equal
- All elements in the input, which are divisible by 5 should be in same group.
- All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
- Elements which are neither divisible by 5 nor by 3, can be put in any group.
Groups can be made with any set of elements, i.e. elements need not to be continuous. And you need to consider each and every element of input array in some group.
Return true, if array can be split according to the above rules, else return false.*/

public class solution { 

    public static boolean splitArray(int input[]) { 
        return check(input, 0, 0, 0); 
    } 

    public static boolean check(int input[], int startIndex, int lSum, int rSum) { 
        if(startIndex == input.length) { 
            return lSum == rSum; 
        } 
        if(input[startIndex] % 5 == 0) { 
            lSum += input[startIndex];
        } 
         else if(input[startIndex] % 3 == 0) { 
            rSum += input[startIndex]; 
        } 
        else {
         boolean leftAns = check(input, startIndex+1, lSum+input[startIndex], rSum);
         boolean rightAns = check(input, startIndex+1, lSum, rSum + input[startIndex]); 
         return leftAns || rightAns;
         } 
         return check(input, startIndex + 1, lSum, rSum); 
    } 
 }