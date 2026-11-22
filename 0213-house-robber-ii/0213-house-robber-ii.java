
class Solution{
    int rob(int nums[],int idx,int end,int memo[]){
        if(idx>end) return 0;
        if(memo[idx]!=-1) return memo[idx];
        int pick=nums[idx]+rob(nums,idx+2,end,memo);
        int npick=rob(nums,idx+1,end,memo);
        return memo[idx]=Math.max(pick,npick);
    }
    public int rob(int[] nums){
        if(nums.length==1) return nums[0];
        int memo1[]=new int[nums.length+1];
        int memo2[]=new int[nums.length+1];
        Arrays.fill(memo1,-1);
        Arrays.fill(memo2,-1);
        return Math.max(rob(nums,0,nums.length-2,memo1),rob(nums,1,nums.length-1,memo2));
    }
}
