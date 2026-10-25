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
class Solution{
    public int maxLevelSum(TreeNode root){
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        int max=Integer.MIN_VALUE;
        int level=0;
        int maxLevel=0;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> al=new ArrayList<>();
            int sum=0;
            level++;
            for(int i=0;i<n;i++){
                TreeNode cur=q.remove();
                al.add(cur.val);
                sum+=cur.val;
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            ans.add(al);
            if(sum>max){
                max=sum;
                maxLevel=level;
            }
        }
        return maxLevel;
    }
}