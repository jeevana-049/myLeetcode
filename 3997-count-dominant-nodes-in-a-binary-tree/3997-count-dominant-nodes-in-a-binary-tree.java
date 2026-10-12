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
    private int countD = 0;
    public int h(TreeNode root){
        if(root == null) return 0;
        int left = h(root.left);
        int right = h(root.right);
        if(root.val >= left && root.val >= right)countD++;
        return Math.max(root.val, Math.max(right, left));
    }
    public int countDominantNodes(TreeNode root) {
        countD = 0;
        h(root);
        return countD;
    }
}