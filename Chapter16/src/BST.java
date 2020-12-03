public class BST {
    static class Node {
        int key;
        Node right;
        Node left;

        public Node(int data) {
            this.key = data;
            this.right = null;
            this.left = null;
        }
    }

    Node root;

    public BST() {
        root = null;
    }

    public BST(int data) {
        root = new Node(data);
    }

    public void insert(int data) {
        insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        }

        if (data < root.key) {
            root.left = insertRec(root.left, data);
        } else if (data > root.key) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    public Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);

        }

        return root;

    }

    int minValue(Node root) {
        int minVal = root.key;
        while (root.left != null) {
            minVal = root.left.key;
            root = root.left;
        }
        return minVal;
    }


    public static void main(String[] args) {
        BST tree = new BST(100);
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.deleteKey(50);

        tree.inorder();

    }
}
