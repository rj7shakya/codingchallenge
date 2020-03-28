public class Paren {
    static class stack{
        int top = -1;
        char items[] = new char[100];

        void push(char x){
            if(top == 99){
                System.out.println("Stack full");
            }else{
                items[++top] = x;
//                top++;
            }
        }

        char pop(){
            if(top == -1){
                System.out.println("empty stack");
                return '\0';
            }else{
                char element = items[top];
                top--;
                return element;
            }
        }

        boolean isEmpty(){
            return (top == -1)?true:false;
        }

    }

    static boolean isMatch(char c1, char c2){
        if(c1 == '(' &&c2 == ')' ){
            return true;
        }else if(c1 == '[' &&c2 == ']'){
            return true;
        }else if(c1 == '{' &&c2 == '}'){
            return true;
        }else{
            return false;
        }
    }

    static boolean areParen(char c[]){
        stack st = new stack();
        for(int i=0;i<c.length;i++){
            if(c[i]=='{' || c[i]=='(' ||c[i]=='['){
                st.push(c[i]);
//                System.out.println(st);
            }
            if(c[i]=='}' || c[i]==')' ||c[i]==']'){
                if(st.isEmpty()){
                    return false;
                }else if(!isMatch(st.pop(),c[i])){
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        char exp[] = {'{',')','}','[',']'};
        System.out.println(areParen(exp));
    }
}
