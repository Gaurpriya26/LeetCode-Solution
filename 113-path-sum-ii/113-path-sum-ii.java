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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        helper(root,targetSum,res,ans);
        return res;
    }
    public void helper(TreeNode root,int Sum,List<List<Integer>> res,List<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        
        if(root.left==null && root.right==null){
            if(root.val==Sum)
                res.add(new ArrayList<Integer>(ans));
        }
        
        if(root.left!=null){
            helper(root.left,Sum-root.val,res,ans);
            ans.remove(ans.size()-1);
        }
        
       if(root.right!=null){
            helper(root.right,Sum-root.val,res,ans);
            ans.remove(ans.size()-1);
        }
        return;
        
    }
}