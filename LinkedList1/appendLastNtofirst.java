/*Given a linked list and an integer n, append the last n elements of the LL to front.
Indexing starts from 0. You don't need to print the elements, just update the elements and return the head of updated LL.
Assume given n will be smaller than length of LL.
Input format :

Line 1 : Linked list elements (separated by space and terminated by -1)*/


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
    public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
        
        LinkedListNode<Integer> temp = root;
        LinkedListNode<Integer> tail = null;
        
        int len = 0;
        
        while(temp.next != null){
            len++;
            temp = temp.next;
            tail = temp;
        }
        len++;
        temp = root;
        int i =0;
        while(i < (len-n-1)){
            i++;
            temp = temp.next;    
        }
        tail.next = root;
        root = temp.next;
        temp.next = null;
        return root;
        
        
    }
}
