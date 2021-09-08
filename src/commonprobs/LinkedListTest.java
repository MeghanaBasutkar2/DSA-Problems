package commonprobs;

import commonimplementations.LinkedList;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        LinkedList.Node node1 = new LinkedList.Node(3);
        LinkedList.Node node2 = new LinkedList.Node(5);
        LinkedList.Node node3 = new LinkedList.Node(8);
        LinkedList.Node node4 = new LinkedList.Node(7);
        LinkedList.Node node5 = new LinkedList.Node(7);
        LinkedList.Node node6 = new LinkedList.Node(4);
        ll.setHead(node1);
        ll.getHead().setNext(node2);
        ll.getHead().getNext().setNext(node3);
        ll.getHead().getNext().getNext().setNext(node4);
        ll.getHead().getNext().getNext().getNext().setNext(node5);
        ll.getHead().getNext().getNext().getNext().getNext().setNext(node6);
        ll.getHead().getNext().getNext().getNext().getNext().getNext().setNext(null);
        testLL(ll);
        printList(ll.getHead());
    }

    private static void printList(LinkedList.Node node) {
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
    }

    private static void testLL(LinkedList ll) {
        LinkedList.Node ptr1 = ll.getHead();
        LinkedList.Node ptr2;

        while(ptr1!=null && ptr1.getNext()!=null){
            ptr2 = ptr1; //reassign the moving pointer

            while(ptr1!=null && ptr1.getNext()!=null){
            if(ptr1.getData() == ptr2.getNext().getData()){
                ptr2.setNext(ptr1.getNext().getNext()); //skipping
            }else{
                ptr2 = ptr2.getNext(); //moving ahead
            }
           ptr1 = ptr1.getNext(); //will always move one step ahead
        }}
    }
}
