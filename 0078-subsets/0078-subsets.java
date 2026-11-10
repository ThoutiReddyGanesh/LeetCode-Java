class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void fun(int arr[],int idx,ArrayList<Integer> al){
        if(idx>=arr.length){
            ans.add(new ArrayList(al));
            return;
        }
        al.add(arr[idx]);
        fun(arr,idx+1,al);
        al.remove(al.size()-1);
        fun(arr,idx+1,al);
    }

    public List<List<Integer>> subsets(int[] nums) {
        fun(nums,0,new ArrayList<>());
        return ans;
        
    }
}