class Solution {
    public int countDigits(int n) {
        int c=0;
        int temp=n;
        while(n!=0){
            int rem=n%10;
            if(temp%rem==0){
                c++;
            }
            n=n/10;
        }
        return c;
    }
}