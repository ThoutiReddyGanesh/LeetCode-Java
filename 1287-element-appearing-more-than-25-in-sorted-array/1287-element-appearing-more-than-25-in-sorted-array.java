class Solution {
    public int findSpecialInteger(int[] arr) {
    HashMap<Integer,Integer> hs=new HashMap<>();
    for(int x:arr)
     hs.put(x,hs.getOrDefault(x,0)+1);
    int max=0;
    int res=0;
     for(int i=0;i<arr.length;i++){
        if(hs.get(arr[i])>max){
            max=hs.get(arr[i]);
            res=arr[i];
        }
     }
   return res;
    }
}