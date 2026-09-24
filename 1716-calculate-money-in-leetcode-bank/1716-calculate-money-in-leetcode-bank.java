class Solution {
    public int totalMoney(int n) {
        int sum=0;
        
        int weeks=n/7;
        int rem=n%7;
        
        for(int j=0;j<weeks;j++){
            for(int i=1;i<=7;i++){
                sum=sum+i+j;
            }
        }
        
        int dum=0;
        for(int i=1;i<=rem;i++){
            dum=dum+i+weeks;
        }
        
        return sum+dum;
    }
}