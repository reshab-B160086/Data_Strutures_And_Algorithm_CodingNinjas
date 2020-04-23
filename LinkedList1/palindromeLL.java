/*Check if a given linked list is palindrome or not. Return true or false.
Indexing starts from 0.
Input format : Linked list elements (separated by space and terminated by -1*/


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
import java.util.*;
public class Solution {
    public static boolean isPalindrome_2(LinkedListNode<Integer> head) {
        if(head == null || head.next == null){
            return true;
        }
        
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        LinkedListNode<Integer> end = head;
        
        while(fast != null && fast.next != null){
            end = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        end.next = null;
        fast = reverse(slow);
    

        LinkedListNode<Integer> temp = head; 
        
        while(temp != null){
          if(temp.data.equals(fast.data)){
              temp = temp.next;
              fast = fast.next;
          }
        else{
            return false;
        }
        }
        
        return true;
    }

private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
    
             if(head == null || head.next == null){
                 return head;
             }
             
    
             LinkedListNode<Integer> first;
        
             first = reverse(head.next);
    
             head.next.next = head;
             head.next = null;
    
             return first;
    
}
    
    private static void printlinklist(LinkedListNode<Integer> head){
        if(head == null){
            System.out.print("");
            return;
        }
        
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}