class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<=3) return 0; 

        int x=nums[n-1]-nums[2];
        int y=nums[n-2]-nums[1];
        int z=nums[n-3]-nums[0];

        int min=Math.min(x,Math.min(y,z));
        return min;    
    }
}