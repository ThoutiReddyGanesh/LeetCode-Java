class Solution {
    public int tribonacci(int n) {
        int ff=0;
        int sf=1;
        int tf=1;
        int sum=0;
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 1;
        if(n<=0) return -1;
        for(int i=3;i<=n;i++){
            sum=ff+sf+tf;
            ff=sf;
            sf=tf;
            tf=sum;

        }
        return sum;
        
    }
}