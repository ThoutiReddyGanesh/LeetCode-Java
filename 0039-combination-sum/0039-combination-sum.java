class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void fun(int arr[],int idx,int target,ArrayList<Integer>al,int sum){
        if(sum==target){
            ans.add(new ArrayList(al));
            return ;
        }
        if(sum>target || idx>=arr.length){
            return;
        }
        al.add(arr[idx]);
        sum+=arr[idx];
        fun(arr,idx,target,al,sum);
        sum-=arr[idx];
        al.remove(al.size()-1);
        fun(arr,idx+1,target,al,sum);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        fun(candidates,0,target,new ArrayList<>(),0);
        return ans;
        
    }
}