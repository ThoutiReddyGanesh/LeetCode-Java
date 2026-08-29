class Solution {
    public long sumAndMultiply(int n) {
        long s=0;
        long sum=0;
        while(n!=0){
            long rem=n%10;
            sum=sum+rem;
            if(rem!=0)
                s=s*10+rem;
            n=n/10;
        }
        long rev=0;
        while(s!=0){
            long re=s%10;
            rev=rev*10+re;
            s=s/10;
        }
        return rev*sum;
        
    }
}