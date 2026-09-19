class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList <String> al=new ArrayList<>();
        int j=0;
        for(int i=0;i<=n;i++){
            if(target[j]==i+1){
                al.add("Push");
                j++;}
            else{
                al.add("Push");
                al.add("Pop");
            }
            if(j==target.length) return al;
            }
            
        return al;
        
    }
}