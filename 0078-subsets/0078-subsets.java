class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void fun(int nums[],int idx,ArrayList<Integer> al){
        if(idx>=nums.length){
            ans.add(new ArrayList(al));
            return;
        }
        al.add(nums[idx]);
        fun(nums,idx+1,al);
        al.remove(al.size()-1);
        fun(nums,idx+1,al);

    }
    public List<List<Integer>> subsets(int[] nums) {
        fun(nums,0,new ArrayList<> ());
        return ans;   
    }
}