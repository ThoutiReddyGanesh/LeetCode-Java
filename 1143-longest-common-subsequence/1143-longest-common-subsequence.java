class Solution {
    int fun(String t1,String t2,int i,int j,int memo[][]){
        if(i==t1.length() || j==t2.length()) return 0;
        if(memo[i][j]!=-1) return memo[i][j];
            if(t1.charAt(i)==t2.charAt(j)) return memo[i][j]=fun(t1,t2,i+1,j+1,memo)+1;
        return memo[i][j]=Math.max(fun(t1,t2,i+1,j,memo),fun(t1,t2,i,j+1,memo));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int memo[][]=new int[text1.length()][text2.length()] ;
        for(int i=0;i<memo.length;i++) Arrays.fill(memo[i],-1);  
        return fun(text1,text2,0,0,memo);
        
    }
}