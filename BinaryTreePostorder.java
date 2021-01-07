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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        postorderDFS(postorder, root);
        return postorder;
    }
    
    private void postorderDFS(List<Integer> postorder, TreeNode root) {
        if (root == null){return;}
        
        postorderDFS(postorder, root.left);
        postorderDFS(postorder, root.right);
        postorder.add(root.val);
    }
}