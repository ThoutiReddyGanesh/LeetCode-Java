class Solution {
    public int maxDepth(String s) {
        int c=0;
        int i=0;
        int max=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                c++;
                max=Math.max(c,max);
            }
            else if(s.charAt(i)==')'){
                c--;
            }
               i++;
        }
        return max;
    
        
    }
}