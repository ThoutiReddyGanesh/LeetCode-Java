class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0;
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0) z++;
            else if (nums[i]==1) o++;
            else t++;
        }
        i=0;
        for(int j=0;j<z;j++)
            nums[i++]=0;
        for(int j=0;j<o;j++)
            nums[i++]=1;
        for(int j=0;j<t;j++)
            nums[i++]=2;
     
    }
}