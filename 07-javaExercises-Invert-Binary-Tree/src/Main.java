import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode();

        treeNode.val =4;
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);
        treeNode.right=new TreeNode(7);
        treeNode.right.left=new TreeNode(6);
        treeNode.right.right =new TreeNode(9);

        System.out.println(treeToList(invertTree(treeNode)));
    }

    private static List<Integer> treeToList(TreeNode treeNode) {

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(treeNode);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            result.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);

        }
        return result;
    }

    private static TreeNode invertTree(TreeNode treeNode) {

        if (treeNode == null){
            return null;
        }

        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;

        invertTree(treeNode.left);
        invertTree(treeNode.right);

        return treeNode;
    }



}