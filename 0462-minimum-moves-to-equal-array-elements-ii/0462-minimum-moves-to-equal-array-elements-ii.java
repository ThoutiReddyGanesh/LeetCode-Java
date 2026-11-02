class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i=nums[nums.length/2];
        int sum=0;
        for(int j=0;j<nums.length;j++)
        sum=sum+Math.abs(nums[j]-i);
    return sum;

        
    }
}