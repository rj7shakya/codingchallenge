package bst;
import bst.Node;

public class BinaryTree {
    Node n;

    public Node search(Node root, int key){
        if(root==null || root.key == key){
            return root;
        }
        if(root.key >key){
            return search(root.left,key);
        }
        return search(root.right,key);
    }

    public static Node insert(Node root, int x){
        if(root == null){
            root = new Node(x);
            return root;
        }
        if(x>root.key){
            root.right = insert(root.right,x);
        }else if(x<root.key){
            root.left = insert(root.left,x);
        }
        return root;
    }

    static int minval(Node root){
        int minv = root.key;
        while(root.left!= null){
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    public static Node delete(Node root,int key){
        if(root == null) return root;//case 1 leaf node
        if(key < root.key){
            root.left = delete(root.left,key);
        }else if(key>root.key){
            root.right = delete(root.right,key);
        }else{
            if(root.left == null) return root.right;//case 2 1 child
            else if(root.right == null) return root.left;
            root.key = minval(root.right);//case 3 2child
            root.right = delete(root.right,root.key);
        }
        return root;
    }


}
