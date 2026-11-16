
class Solution {
    public String digitSum(String s,int k) {
        while(s.length()>k){
            int i=0;
            int j=k-1;
            String ans="";
            while(i<s.length()){
                int sum=0;
                while(i<=j && i<s.length()){
                    sum+=s.charAt(i)-'0';
                    i++;
                }
                ans+=String.valueOf(sum);
                j+=k;
            }
            s=ans;
        }
        return s;
    }
}
