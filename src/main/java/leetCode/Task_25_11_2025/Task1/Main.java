package leetCode.Task_25_11_2025.Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        root.setLeft(node2);
        node2.setLeft(node3);

        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result);


    }
}
