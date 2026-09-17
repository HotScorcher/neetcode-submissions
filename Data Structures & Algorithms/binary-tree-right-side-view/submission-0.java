/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            TreeNode rightSide = null;
            for (int i = 0; i < levelLength; i++) {
                TreeNode current = queue.removeFirst();
                if (current != null) {
                    rightSide = current;
                    queue.add(current.left);
                    queue.add(current.right);
                }
            }
            if (rightSide != null) list.add(rightSide.val);
        }
        return list;
    }
}
