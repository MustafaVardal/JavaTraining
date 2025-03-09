import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);

        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        // p and q nodes
        TreeNode p = root.left; // 2
        TreeNode q = root.left.right.right; // 5


        TreeNode ancestor = lowestCommonAncestor(root, p, q);


        System.out.println("Lowest Common Ancestor: " + ancestor.val);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null){
            if (Math.min(p.val, q.val) > root.val){
                root = root.right;
            } else if (Math.max(p.val, q.val) < root.val) {
                root = root.left;
            } else {
                return root;
            }
        }
        return null;
    }

}
