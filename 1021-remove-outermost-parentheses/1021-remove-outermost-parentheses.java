class Solution {
    public String removeOuterParentheses(String s) {
        int i=0;
        int j=0;
        int oc=0;
        int cc=0;
       String ans="";
while(j<s.length()){
        if(s.charAt(j)=='('){
            oc++;}
        else if(s.charAt(j)==')'){
            cc++;}
        if(oc==cc){
            ans=ans+s.substring(i+1,j);
            i=j+1;
            oc=0;
            cc=0;}
        j++;
    }
    return ans;
    }
}