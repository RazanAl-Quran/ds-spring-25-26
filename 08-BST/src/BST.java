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
    
}
