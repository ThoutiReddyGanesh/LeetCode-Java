class Solution {
    public int findLucky(int[] arr) {
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<arr.length;i++)
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        int max=0;
     for(int i=0;i<arr.length;i++){
        if(hm.get(arr[i])==arr[i]){
            if(arr[i]>max) max=arr[i];
        }
     }
     if(max==0) return -1;
    return max;

    }
}