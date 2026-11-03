class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int sum=0;
        while(i<j){
            sum=sum+nums[j]-nums[i];
            i++;
        }
    return sum;
    }
}