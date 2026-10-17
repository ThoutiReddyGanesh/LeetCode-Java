class Solution {
    public String truncateSentence(String s, int k) {
        int i=0;
        int c=0;
        while(i<s.length()){
            if(s.charAt(i)==  ' '){
                c++;
                if(c==k)
                return s.substring(0,i);
            }
            i++;
        }
    return s;   
    }
}