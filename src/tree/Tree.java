package tree;

public class Tree {

    private Node root;

    Tree() {
        root = null;
    }

    Tree(Node root) {
        this.root = root;
    }

    static class Node {
        private Node left;
        private Node right;
        private int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        //these nodes would make up the parent nodes of the tree
        Node node1 = new Node(2);
        Node node2 = new Node(5);
        Node node3 = new Node(8);
        Node node4 = new Node(10);
        Node node5 = new Node(12);
        Node node6 = new Node(11);
        Node node7 = new Node(17);

        Tree tree = new Tree(node1); //forms the root node
        /* we can also create the root node using the default constructor as:
         * Tree tree = new Tree();
         * tree.root = node1;
         * */

        //adding nodes one by one
        tree.root.left = node2;
        tree.root.right = node3;
        tree.root.left.left = node4;
        tree.root.left.right = node5;
        tree.root.right.right = node6;
        tree.root.right.left = node7;

        //traversals
        inOrderTraversal(node1);
        System.out.println();

        int element = 21;
        boolean found = search(node1, element);
        System.out.println(found);

        preOrderTraversal(node1);
        System.out.println();
        postOrderTraversal(node1);
    }

    private static void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.right);
            postOrderTraversal(node.left);
            System.out.print(" ");
            System.out.print(node.data);
        }
    }

    private static boolean search(Node rootNode, int element) {
        if (rootNode == null) {
            return false;
        }
        if (rootNode.data == element) { //checking if head-node itself contains the element
            return true;
        }
        boolean inLeft = search(rootNode.left, element);
        if (inLeft) return true;
        return search(rootNode.right, element);
    }

    private static void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(" ");
            System.out.print(node.data);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    private static void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left); //left
            System.out.print(" ");
            System.out.print(node.data); //head
            inOrderTraversal(node.right); //right
        }
    }
}
