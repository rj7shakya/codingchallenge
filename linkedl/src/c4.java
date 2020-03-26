import java.util.LinkedList;

public class c4 {

    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    void remove_duplicates(Node head){
        Node ptr1 = head;
        while(ptr1.next != null ){
            if(ptr1.data != ptr1.next.data){
                ptr1 = ptr1.next;
            }else{
                int dup = ptr1.next.data;
                ptr1.next = ptr1.next.next;
            }
        }
    }

    void printList(Node node){
        while(node != null){
            System.out.println(node.data+ " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        c4 list = new c4();
        list.head = new Node(10);
        list.head.next = new Node(11);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(14);
        list.head.next.next.next.next.next.next = new Node(14);

        list.printList(head);
        list.remove_duplicates(head);
        System.out.println("after duplicates removal");
        list.printList(head);
    }
}
