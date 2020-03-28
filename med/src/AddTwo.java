import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

public class AddTwo {
    static Node head1,head2;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    Node addTwoLists(Node first,Node second){
        Node temp=null,res=null,prev=null;
        int carry=0,sum=0;
        while (first!=null || second!=null){
            sum = carry +
                    (first!=null?first.data:0)+
                    (second!=null?second.data:0);
            carry = (sum>=10)? 1 : 0;
            sum = sum%10;
            temp = new Node(sum);
            if(res == null){
                res = temp;
            }else{
                prev.next=temp;
            }

            prev=temp;
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
            System.out.println("temp"+temp.data);
            System.out.println("res");
//            this.showList(res);
//            temp = temp.next;
        }
        if (carry > 0) {
            temp.next = new Node(carry);
        }
        return res;
    }

    void showList(Node head){
        while(head != null){
            System.out.println(head.data+ " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        AddTwo list = new AddTwo();

        list.head1 = new Node(2);
        list.head1.next = new Node(4);
        list.head1.next.next = new Node(9);
//        list.head1.next.next.next = new Node(4);
//        list.head1.next.next.next.next = new Node(6);
        System.out.print("First List is ");
        list.showList(head1);

        list.head2 = new Node(5);
        list.head2.next = new Node(2);
        System.out.print("Second List is ");
        list.showList(head2);

        Node rs = list.addTwoLists(head1, head2);
        System.out.print("Resultant List is ");
        list.showList(rs);
    }
}
