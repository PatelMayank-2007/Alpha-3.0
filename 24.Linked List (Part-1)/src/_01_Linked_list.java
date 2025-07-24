import java.util.*;

public class _01_Linked_list {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step-1:create a new node
        Node newNode = new Node(data);
        //base case
        if(head == null){
            head=tail=newNode;
            return;
        }
        //step_2:newNode's next pointing towards head
        newNode.next = head;
        //step-3:creating newNode which is added first as head;
        head = newNode;
    }

    public void addlast(int data){
        //step -1:create new node
        Node newNode = new Node(data);
        //base class
        if(head==null){
            head=tail=newNode;
        }
        //step-2 tail pointing towards newNode
        tail.next = newNode;
        //step-3:creating newNode as tail
        tail = newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is Empty");
        }
        //storing head value in temp
        Node temp = head;
        //looping till end of ll.
        while(temp!=null){
            //printing the temp's data
            System.out.print(temp.data+"->");
            //updating temp to next node
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        _01_Linked_list ll = new _01_Linked_list();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();
    }
}
