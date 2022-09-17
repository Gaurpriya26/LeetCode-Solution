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
    public boolean isSameTree(TreeNode p, TreeNode q) {
       List<Integer> res1=new ArrayList<>();
       List<Integer> res2=new ArrayList<>();
        helper(p,res1);
        helper(q,res2);
        return res1.equals(res2);     
    }
    public void helper(TreeNode p, List<Integer> res){
        if(p==null) {
            res.add(-1);
            return;
        }
            
        res.add(p.val);
        helper(p.left,res);
        helper(p.right,res);
    }
}