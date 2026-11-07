class Solution {
     List<List<Integer>> ans=new ArrayList<>();
    void find(int arr[],int idx,ArrayList<Integer> al){
        if(idx>=arr.length){
            ans.add(new ArrayList(al));
            return;
        }
        al.add(arr[idx]);
        find(arr,idx+1,al);
        al.remove(al.size()-1);
        while(idx<arr.length-1 && arr[idx]==arr[idx+1]) idx++;
        find(arr,idx+1,al);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        find(nums,0,new ArrayList<>());
        return ans;
        
    }
}