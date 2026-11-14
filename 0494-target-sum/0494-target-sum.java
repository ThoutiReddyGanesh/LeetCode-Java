class Solution {
    int c=0;
    void fun(int arr[],int idx,int sum,int t){
        if(idx>=arr.length){
            if(sum==t) c++;
            return;
        }
        fun(arr,idx+1,sum+arr[idx],t);
        fun(arr,idx+1,sum-arr[idx],t);
    }
public int findTargetSumWays(int[] nums, int target) {
        fun(nums,0,0,target);
    return c;
    }
}