class Solution {
    public int sumCounts(List<Integer> nums) {
       int sum=0;
       for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                HashSet<Integer> hs=new HashSet<>();
                for(int k=i;k<=j;k++)
                    hs.add(nums.get(k));
                    int c=hs.size();
                    sum=sum+(c*c);
            }
        }
        return sum;
    }
}