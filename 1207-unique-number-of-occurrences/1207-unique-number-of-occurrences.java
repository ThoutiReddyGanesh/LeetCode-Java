class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
        for(int x:arr) hm.put(x,hm.getOrDefault(x,0)+1);
        for(int x:hm.keySet()) {
            int y=hm.get(x); 
            hm2.put(y,hm2.getOrDefault(y,0)+1);
        }
        for(int x:hm2.keySet()){
             if(hm2.get(x)>1) return false;
        }
    return true;        
    }
}