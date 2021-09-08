package tree;

public class BinaryTree {

    private Node root;

    private BinaryTree() {
        root = null;
    }

    //we could also use this to init the root node
    private BinaryTree(Node root) {
        this.root = root;
    }

    private void insertValue(int value) {
        root = insert(root, value);
    }

    private Node insert(Node root, int element) {
        if (root != null) {
            if (element > root.value) {
                root.right = insert(root.right, element);
            } else if (element < root.value) {
                root.left = insert(root.left, element);
            }
        } else {
            return new Node(element);
        }
        return root;
    }

    static class Node {
        private int value;
        private Node right;
        private Node left;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertValue(6);
        tree.insertValue(7);
        tree.insertValue(12);
        tree.insertValue(11);
        tree.insertValue(32);
        tree.insertValue(14);
        tree.insertValue(4);

        tree.traverse();
    }

    private void traverse() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root != null) {
            traverseInOrder(root.left);
            System.out.print(" ");
            System.out.print(root.value);
            traverseInOrder(root.right);
        }
    }
}

