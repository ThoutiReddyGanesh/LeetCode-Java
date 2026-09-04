class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(target==nums[i]+nums[j])
                return new int[]{i+1,j+1};
            else if(nums[i]+nums[j]>target) j--;
            else i++;
        }
        
      return new int[]{};
    }
}