import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the root value of the tree: ");
        int rootValue = scanner.nextInt();
        TreeNode root = new TreeNode(rootValue);

        while (true) {
            System.out.println("Enter parent node value to add children (or -1 to stop): ");
            int parentValue = scanner.nextInt();

            if (parentValue == -1) break;

            TreeNode parentNode = findNode(root, parentValue);
            if (parentNode == null) {
                System.out.println("Parent node not found. Try again.");
                continue;
            }

            System.out.println("Enter left child value (or -1 if none): ");
            int leftValue = scanner.nextInt();
            if (leftValue != -1) parentNode.left = new TreeNode(leftValue);

            System.out.println("Enter right child value (or -1 if none): ");
            int rightValue = scanner.nextInt();
            if (rightValue != -1) parentNode.right = new TreeNode(rightValue);
        }

        scanner.close();
        boolean result = isBalanced(root);
        System.out.println("Is the tree balanced? " + result);
    }

    private static TreeNode findNode(TreeNode root, int value) {
        if (root == null) return null;
        if (root.val == value) return root;

        TreeNode leftSearch = findNode(root.left, value);
        if (leftSearch != null) return leftSearch;

        return findNode(root.right, value);
    }

    private static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return helper(root) != -1;
    }

    private static int helper(TreeNode root) {
        if (root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
