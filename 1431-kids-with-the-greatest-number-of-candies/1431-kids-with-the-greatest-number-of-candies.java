class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int arr[]=candies.clone();
        Arrays.sort(arr);
        List<Boolean> al=new ArrayList<>();
        int i=0;
        while(i<candies.length){
            if(candies[i]+extraCandies>=arr[arr.length-1])
                al.add(true);
            else al.add(false);
            i++;
            }
    return al;
    }
}