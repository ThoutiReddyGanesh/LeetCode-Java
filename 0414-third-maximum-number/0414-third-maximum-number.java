class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hs=new HashSet<>();

        for(int x:nums)
        hs.add(x);
         int arr[]=new int[hs.size()];
         int i=0;
         for(int x:hs){
            arr[i]=x;
            i++;
         }
        Arrays.sort(arr);
        if(arr.length==2)return arr[1];
        else if(arr.length==1) return arr[0];
         
        return arr[arr.length-3];
        
    }
}