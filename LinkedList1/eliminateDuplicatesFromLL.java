/*Given a sorted linked list (elements are sorted in ascending order). Eliminate duplicates from the given LL, such that output LL contains only unique elements.
You don't need to print the elements, just remove duplicates and return the head of updated LL.
Input format : Linked list elements (separated by space and terminated by -1)*/



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
    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if(head == null || head.next == null)
            return head;
        
        LinkedListNode<Integer> temp1 = head;
        LinkedListNode<Integer> temp2 = head.next;
        
        
        while(temp2 != null){
            
            if(temp1.data.equals(temp2.data)){
                temp2 = temp2.next;
            }
            else{
                temp1.next = temp2;
                temp1 = temp2;
                temp2 = temp2.next;
            }
            
        }
            temp1.next = temp2;
        
        return head;
        
    }
 
}