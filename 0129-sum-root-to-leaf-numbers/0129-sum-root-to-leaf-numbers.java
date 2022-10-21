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
       
    public int sumNumbers(TreeNode root) {
     if(root==null) return 0;
     return helper(root,0);
     
    }
    public int helper(TreeNode root,int num){
        if(root==null) return 0;
      if(root.right==null && root.left==null) return num*10+root.val;
        return  helper(root.right,num*10+root.val)+  helper(root.left,num*10+root.val);
    }
}