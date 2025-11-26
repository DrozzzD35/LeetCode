package leetCode.Task_25_11_2025.Task1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);

        return result;
    }

    private void helper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        helper(node.getLeft(), result);
        result.add(node.getVal());
        helper(node.getRight(), result);
    }

}
