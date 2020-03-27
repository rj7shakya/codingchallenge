public class base_stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty(){
        return (top<0);
    }
    base_stack(){
        top = -1;
    }

    boolean push(int x){
        if(top >= (MAX-1)){
            System.out.println("stack overflow");
            return false;
        }else{
            top++;
            a[top] = x;
            return true;
        }
    }

    int pop(){
        if(top < 0){
            System.out.println("stack underflow");
            return 0;
        }else{
            int x =  a[top];
            top--;
            return x;
        }
    }

    public static void main(String[] args) {
        base_stack s = new base_stack();
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}
