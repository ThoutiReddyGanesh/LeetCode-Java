
class Solution {
    public int lastStoneWeight(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int x:nums) al.add(x);
        while(al.size()>1){
            Collections.sort(al);
            int i=al.size()-1;
            int j=al.size()-2;
                if(al.get(i)==al.get(j)){
                    al.remove(i);
                    al.remove(j);
                }
                else if(al.get(i)!=al.get(j)){
                    int a=al.get(i)-al.get(j);
                    al.remove(i);
                    al.remove(j);
                    al.add(a);
                }
            }
        if(al.size()==0) return 0;
        return al.get(0);
    }
}
