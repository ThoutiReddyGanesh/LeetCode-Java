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
    TreeNode fun(int arr[],int st,int end){
        if(st<=end){
            int mid=st+(end-st)/2;
            TreeNode root=new TreeNode(arr[mid]);
            root.left=fun(arr,st,mid-1);
            root.right=fun(arr,mid+1,end);
        return root;
        }
        return null;
    }
    
    public TreeNode sortedArrayToBST(int[] arr) {
        return fun(arr,0,arr.length-1);
    }
    }
