public class BSTSearch {

    static TreeNode search(TreeNode root, int key) {

        if (root == null || root.data == key)
            return root;

        if (key < root.data)
            return search(root.left, key);

        return search(root.right, key);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        int key = 60;

        if (search(root, key) != null)
            System.out.println(key + " found in BST.");
        else
            System.out.println(key + " not found.");
    }
}