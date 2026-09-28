class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        int i=0;
    while(i<candies.length){
            max=Math.max(max,candies[i]);
            i++;}
        List<Boolean> al=new ArrayList<>();
         i=0;
        while(i<candies.length){
            if(candies[i]+extraCandies>=max)
                al.add(true);
            else al.add(false);
            i++;
            }
    return al;
    }
}