class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=prices.length-1;
        int j=discounts.length-1;
        double min=0;
        while(i>=0 && j>=0){
              double res=(prices[i]*(100-discounts[j]))/100.0;
            min=min+res;
            i--;
            j--;
            }
            while(i>=0){
                min=min+prices[i];
                i--;

            }
            return min;
        
    }
}