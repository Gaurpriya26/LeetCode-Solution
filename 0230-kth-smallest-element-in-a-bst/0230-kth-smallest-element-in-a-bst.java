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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans=helper(root,new ArrayList<Integer>());
        return ans.get(k-1);
    }
    public ArrayList<Integer> helper(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return arr;
        helper(root.left,arr);
        arr.add(root.val);
        helper(root.right,arr);
        return arr;
    }
}