package LinkedList_Udemy;

import java.util.Iterator;
import java.util.LinkedList;

public class CreationOfLinkedList {
    public static void main(String[] args){
        Node ten=new Node(10);
        Node twenty=new Node(20);
        Node thirty=new Node(30);
        Node forty=new Node(40);
        Node fifty=new Node(50);

        Node head = null;
//        ten.setNext(twenty);
//        twenty.setNext(thirty);
//        thirty.setNext(forty);
//        forty.setNext(fifty);
//        fifty.setNext(null);
        head=insertAtFront(head,50);
        head=insertAtFront(head,40);
        head=insertAtFront(head,30);
        head=insertAtFront(head,20);
        head=insertAtFront(head,10);
        head = insertAtFront(head, 3);
        printLinkedList(head);
        head = deleteAtFront(head);
        printLinkedList(head);
        head = deleteAtFront(head);
        printLinkedList(head);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0,42);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(list.contains(4));

//        Iterator<Integer> di = list.descendingIterator();
//        while(di.hasNext()){
//            System.out.println(di.next());
//        }

        list.remove();
        System.out.println("After removing the first element");
        System.out.println(list);
        list.removeFirstOccurrence(2);
        System.out.println("After removing the first element");
        System.out.println(list);
        list.removeLastOccurrence(2);
        System.out.println("After removing the first element");
        System.out.println(list);

    }

    public static void printLinkedList(Node head){
        System.out.println("Printing the linked list");
        Node curr=head;
        while(curr.getData()!=50){
            System.out.println(curr.getData());
            curr=curr.getNext();
        }
    }

    public static Node insertAtFront(Node head, int data){
        Node n = new Node(data);
        if(head==null){
            head=n;
        }else{
            n.setNext(head);
            head=n;
        }
        return head;
    }

    public static Node deleteAtFront(Node head){
        if(head!=null) {
            head = head.getNext();
        }
        return head;
    }


}
