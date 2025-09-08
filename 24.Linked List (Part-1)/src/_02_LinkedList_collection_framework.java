import java.util.LinkedList;
public class _02_LinkedList_collection_framework {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList<Integer>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);


        //printing
        System.out.println(ll);

        //removing

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}

