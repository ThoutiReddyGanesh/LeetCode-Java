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
    public int getMinimumDifference(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> al=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode cur=q.remove();
                al.add(cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
        }
        Collections.sort(al);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<al.size()-1;i++){
           min = Math.min(min , al.get(i+1)-al.get(i));
        }
    return min;
    }
}