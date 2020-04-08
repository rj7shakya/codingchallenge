package bst;
import bst.BinaryTree;
import bst.Node;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        Node root = new Node(20);

        bst.insert(root,10);
        root.inorder(root);
        System.out.println("");
        bst.insert(root,15);
        root.inorder(root);
        System.out.println("");
        bst.insert(root,30);
        root.inorder(root);
        System.out.println("");
        bst.insert(root,40);
        root.inorder(root);
        System.out.println("");
//        bst.insert(root,9);
        bst.delete(root,30);
        root.inorder(root);
        System.out.println("");

        Node x = bst.search(root,30);


    }
}
