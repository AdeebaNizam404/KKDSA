package TreesDataStructure;

public class AVLTrees {

    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.height = 0;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVLTrees() {
    }

    //  height function
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    //   overall tree height
    public int height() {
        return height(root);
    }

    public boolean isEmpty() {
        return root == null;
    }

    //  Public insert
    public void insert(int value) {
        root = insert(value, root);
    }

    //  Recursive insert with balancing
    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }
        // update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // balance if needed
        return rotate(node);
    }

    //  Rotations and balancing
    private Node rotate(Node node) {
        int balance = height(node.left) - height(node.right);

        // Left heavy
        if (balance > 1) {
            if (height(node.left.left) >= height(node.left.right)) {
                // Left Left
                return rightRotate(node);
            } else {
                // Left Right
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // Right heavy
        if (balance < -1) {
            if (height(node.right.right) >= height(node.right.left)) {
                // Right Right
                return leftRotate(node);
            } else {
                // Right Left
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node; //  no infinite recursion
    }

    //  Right rotation
    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    //  Left rotation
    private Node leftRotate(Node p) {
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    // Populate array into tree
    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    //  Populate sorted array into balanced tree
    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length - 1);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid - 1);
        populateSorted(nums, mid + 1, end);
    }

    //  Balanced check
    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left)
                && balanced(node.right);
    }

    //  Display tree
    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    //  Main method to test
    public static void main(String[] args) {
        AVLTrees tree = new AVLTrees();

        // Insert sequential numbers
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }

        // Height of balanced AVL tree should be ~ log2(1000) ≈ 10
        System.out.println("Height of AVL Tree: " + tree.height());

        // Display tree balance
        System.out.println("Tree balanced? " + tree.balanced());
    }
}
