/*Given a linked list and an integer n you need to find and return index where n is present in the LL. Do this iteratively.
Return -1 if n is not present in the LL.*/
/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public Node(T data) {
        this.data = data;
    }
}
 ***************/

public class Solution {
    public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
        */
        
        
        LinkedListNode<Integer> temp = head;
        
        int i = 0;
        
        while(temp != null){
            if(temp.data == n){
                return i; 
            }
            temp = temp.next;
            i++;
        }
        
        return -1;
    }
}