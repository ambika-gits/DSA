public class BSTMinMax {

    static int findMin(TreeNode root) {

        while (root.left != null)
            root = root.left;

        return root.data;
    }

    static int findMax(TreeNode root) {

        while (root.right != null)
            root = root.right;

        return root.data;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(30);
        root.right = new TreeNode(70);

        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        System.out.println("Minimum Element: " + findMin(root));
        System.out.println("Maximum Element: " + findMax(root));
    }
}