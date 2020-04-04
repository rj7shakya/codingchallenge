import java.util.Stack;

public class Qc {
//    static class Q{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
//    }
    public void enQueue( int x)
    {
        stack1.push(x);
    }

    public int dequeue(){
        if(stack2.isEmpty()){
            while (! stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Qc q = new Qc();
        q.enQueue(12);
        q.enQueue(23);
        q.enQueue(34);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }



}
