public class BST {

    TreeNode root;

    public BST(){
        this.root = null;
    }

    // Method to insert a value into the BST
    public void insert(int val) {
        this.root = insertNode(this.root, val);
    }

    // Helper method to recursively insert a value into the BST
    private TreeNode insertNode(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    // Method to search for a value in the BST
    public boolean search(int val) {
        return searchNode(this.root, val);
    }

    // Helper method to recursively search for a value in the BST
    private boolean searchNode(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (val == root.val) {
            return true;
        } else if (val < root.val) {
            return searchNode(root.left, val);
        } else {
            return searchNode(root.right, val);
        }
    }

    // Method to perform inorder traversal of the BST
    public void inorderTraversal() {
        inorder(this.root);
        System.out.println();
    }

    // Helper method to recursively perform inorder traversal
    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    
}
