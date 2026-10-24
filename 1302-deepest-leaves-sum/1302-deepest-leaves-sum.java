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
    public int deepestLeavesSum(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> al=new ArrayList<>();
            for(int i=0;i<n;i++){
            TreeNode cur=q.remove();
            al.add(cur.val);
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
            }
        ans.add(al);
        }
        int sum=0;
        for(int i=0;i<ans.get(ans.size()-1).size();i++)
            sum+=ans.get(ans.size()-1).get(i);
    return sum;
    }
}