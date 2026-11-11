
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void fun(int arr,int idx,ArrayList<Integer> al,int t){
        if(idx>arr){
            if(al.size()==t){
            ans.add(new ArrayList(al));
            }
            return;
        }
        al.add(idx);
        fun(arr,idx+1,al,t);
        al.remove(al.size()-1);
        fun(arr,idx+1,al,t);
    }

       public List<List<Integer>> combine(int n, int k) {
        fun(n,1,new ArrayList<>(),k);
        return ans;
        
    }
}