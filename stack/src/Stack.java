public class Stack {
    StackNode root;

    static class StackNode{
        int data;
        StackNode next;
        StackNode(int data){
            this.data = data;
        }
    }

    public boolean isEmpty(){
        if(root == null){
            return true;
        }else{
            return false;
        }
    }

    public void push(int data){
        StackNode newnode = new StackNode(data);
        if(root == null){
            root = newnode;
        }else{
            StackNode temp = root;
            root = newnode;
            newnode.next = temp;
        }
        System.out.println(data + "pushed to stack");
    }

    public int pop(){
        int poped = Integer.MIN_VALUE;
        if (root == null){
            System.out.println("stack is empty");
        }else{
            poped = root.data;
            root = root.next;
        }
        return poped;
    }

    public static void main(String[] args) {
        Stack sl = new Stack();
        sl.push(12);
        sl.push(13);
        sl.push(14);
        sl.push(15);
        System.out.println(sl.pop());
        System.out.println(sl.pop());
        System.out.println(sl.pop());
        System.out.println(sl.pop());
    }
}
