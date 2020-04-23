/*Print a given linked list in reverse order. You need to print the tail first and head last. You can’t change any pointer in the linked list, just print it in reverse order.
Input format : Linked List elements (separated by space and terminated by -1)

Output format : Linked List elements in reverse order (separated by space)*/


/*
class LinkedListNode<T> {
    public T data;
    public LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.setData(data);
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
* */
public class Solution {
    public static void printReverseRecursive(LinkedListNode<Integer> root) {
        LinkedListNode<Integer> temp = root;
        helper(temp);
    }
    
    
    
    private static void helper(LinkedListNode<Integer> root){
        
        if(root == null){
            return;
        }
        else if(root.next == null){
            System.out.print(root.data + " ");
            return;
        }
        
        helper(root.next);
        
        System.out.print(root.data+" ");
        
        
    }
}