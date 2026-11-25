class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int mid=i+(j-i)/2;
        int c=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==nums[mid])
                c++;
        }
        if(c==1) return true;
    return false;
        
    }
}