class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int x:nums1) {
                hs.add(x);}

        for(int x:nums2){
            if(hs.contains(x))
            hs2.add(x);}
    
    int arr[]=new int[hs2.size()];
    int i=0;
    for(int x:hs2){
        arr[i]=x;
        i++;
    }
    return arr;
    }
}