package bst;

public class Node {
    int key;
    Node left,right;
    public Node(int data){
        key =data;
        left=right=null;
    }

    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
}
