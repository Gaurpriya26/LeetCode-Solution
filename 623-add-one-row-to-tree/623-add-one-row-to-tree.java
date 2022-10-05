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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode t=new TreeNode(val);
            t.left=root;
            return t;
        }
        insert(root,val,depth,1);
        return root;
    }
    public void insert(TreeNode root, int val, int depth, int n){
        if(root==null) return;
        if(n==depth-1){
           TreeNode t=new TreeNode(val);
            t.left=root.left;
            root.left=t;
            TreeNode a=new TreeNode(val);
            a.right=root.right;
            root.right=a;
        }
            
        else{
            insert(root.left,val,depth,n+1);
            insert(root.right, val,depth,n+1);
        }
            
    }
}