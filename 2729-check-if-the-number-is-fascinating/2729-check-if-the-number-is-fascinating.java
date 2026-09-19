class Solution{
    public boolean isFascinating(int n){
        int a=n;
        int b=2*n;
        int c=3*n;
        String result=""+a+b+c;
        int count=0;
        for(int i=1;i<=9;i++){
            if(result.indexOf(String.valueOf(i))!=-1){
                count++;}
        }
        if(count==9 && result.length()==9)
            return true;
        return false;
    }
}