class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}