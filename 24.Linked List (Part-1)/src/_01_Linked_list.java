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
    public static int size;

    public void addFirst(int data){
        //step-1:create a new node
        Node newNode = new Node(data);
        size++;
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
        size++;
        //base class
        if(head==null){
            head=tail= newNode;
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
        size++;
        // Step 2: Create a temporary pointer to traverse the linked list, starting from head.
        Node temp = head;
        // Step 3: Initialize a counter i to track the current position.
        int i = 0;
        // Step 4: Move temp to the node just before the desired index (index - 1).It means at point (index-1) it is previous node.
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

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        if(size ==1 ){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1 ){
            head = tail = null;
            size=0;

        }
        //previous node = size -2;
        Node temp = head;
        for(int i = 0 ; i<size-2;i++){
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data==key) {
                return i;
            }

            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int  helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }


    public void itrreverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next ;
        while (curr != null){
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void removeNthFromEnd(int n){
        //calculate size
        int size = 0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        //finding previous and pointing previous to next to next node then it will automatically delete middle node
        //previous node = size-n
        int i=1;
        int iToFind = size-n;//this will be the index of previos node
        Node prev = head;
        while(i<iToFind){
            prev=prev.next;//this will reach to desire previos node from the node to deleted.
            i++;
        }
        prev.next=prev.next.next;//this will remove middle desired node.
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next ==null){
            slow = slow.next;//append by +1
            fast = fast.next.next;// append by +2
        }
        return slow;
    }

    public boolean checkPalindrome(){
        //edge case
        if(head == null || head.next != null){
            return true;
        }
        //step-1 - find mid
        Node  midNode = findMid(head);

        //step2-reverse the second half of the linked list.
        Node prev = null;
        Node curr =midNode;
        Node next ;
        while (curr != null){
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right = prev;
        Node left = head;

        //step3 - check lest half and right half for the palindrome.
        while (right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle(){
        Node slow= head;
        Node fast= head;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }

    public void removeCycle(){
        //step-1 detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow= slow.next;

            if (fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //step-2 initilize slow as head again;
        slow=head;
        //step-3 noe increase slow and fast by one and find meeting point and make previos of the meeting point to null;
        Node previous = null;
        while(slow!=fast){
            previous = fast;
            slow=slow.next;
            fast = fast.next;
        }
        //make pevious.next null
        previous.next = null;
    }

    public static void main(String[] args) {
        _01_Linked_list ll = new _01_Linked_list();
        ll.addlast(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(2);
        ll.addlast(5);

        ll.print();
        System.out.println("Size of ll:" + ll.size);
        ll.tail.next = ll.head.next;
//          [1] → [3] → [4] → [2] → [5]
//                ↑                   |
//                └───────────────────┘
        ll.removeCycle();
        //remove the cycle and print if the cycle exist or not
        System.out.println(ll.isCycle());


    }
}
