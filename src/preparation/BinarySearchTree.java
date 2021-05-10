package preparation;

public class BinarySearchTree {

    class Node {
        private int key;
        private Node left;
        private Node right;

        public Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    Node root;

    public void add(int key) {
        root = addRec(root, key);
    }

    private Node addRec(Node root, int key) {
        if(root == null) {
            root = new Node(key);
            return root;
        } else if(key > root.key) {
            root.right = addRec(root.right, key);
        } else {
            root.left = addRec(root.left, key);
        }
        return root;
    }

    public void displayInorder() {
        displayInorderRec(root);
    }

    private void displayInorderRec(Node root) {
        if(root != null) {
            displayInorderRec(root.left);
            System.out.print(root.key + " ");
            displayInorderRec(root.right);
        }
    }

    public void search(int key) {
        searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if(root!=null) {
            if(root.key == key)
                return true;
            else if(key > root.key)
                return searchRec(root.right, key);
            return searchRec(root.left, key);
        }
        return false;
    }

    public static void main(String ... args) {

        BinarySearchTree h = new BinarySearchTree();
        h.add(20);
        h.add(25);
        h.add(15);
        h.add(12);
        h.add(18);
        h.add(17);
        h.add(30);
        h.add(40);
        h.add(35);
        h.add(28);

        h.displayInorder();

    }

}
