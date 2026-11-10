class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    void fun(int arr[],int idx,ArrayList<Integer> al){
        if(idx==arr.length){
            for(int j=0;j<arr.length;j++){
                al.add(arr[j]);
            }
            ans.add(new ArrayList<>(al));
            return;
        }

        for(int k=idx;k<arr.length;k++){
            int temp=arr[idx];
            arr[idx]=arr[k];
            arr[k]=temp;
            fun(arr,idx+1,new ArrayList <>());
            temp=arr[idx];
            arr[idx]=arr[k];
            arr[k]=temp;

        }
    }
       
    public List<List<Integer>> permute(int[] nums) {
         fun(nums,0,new ArrayList<>());
        return ans;
        
    }
}