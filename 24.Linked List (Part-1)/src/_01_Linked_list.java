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


    public void add(int index, int data) {
        //if index entered is one than we call addfrist method.
        if(index== 0){
            addFirst(data);
            return;
        }

        // Step 1: Create a new node with the provided data.
        Node newNode = new Node(data);
        // Step 2: Create a temporary pointer to traverse the linked list, starting from head.
        Node temp = head;
        // Step 3: Initialize a counter i to track the current position.
        int i = 0;
        // Step 4: Move temp to the node just before the desired index (index - 1).
        while (i < index - 1) {
            temp = temp.next; // move to the next node
            i++;
        }
        // Now, temp is at (index - 1), and we are ready to insert the new node.
        // Step 5: temp node next is pointing towards next position in linked list now we have to insert in between this two so temp's next value we will store in newNode's next.
        newNode.next = temp.next;
        // Step 6: Point the previous node's (at index - 1) next to the new node, linking it into the list.
        temp.next = newNode;
    }


    public static void main(String[] args) {
        _01_Linked_list ll = new _01_Linked_list();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();
        ll.add(2,9);
        ll.print();
    }
}
