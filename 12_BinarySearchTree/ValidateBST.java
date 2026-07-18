public class ValidateBST {

    static boolean isValidBST(TreeNode root, Integer min, Integer max) {

        if (root == null)
            return true;

        if ((min != null && root.data <= min) ||
            (max != null && root.data >= max))
            return false;

        return isValidBST(root.left, min, root.data)
                && isValidBST(root.right, root.data, max);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(30);
        root.right = new TreeNode(70);

        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        if (isValidBST(root, null, null))
            System.out.println("Valid BST");
        else
            System.out.println("Invalid BST");
    }
}