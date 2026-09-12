class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                d=Math.max(d,c);
            }
            else{
                c=0;
            }
        }
        return d;
    }
}