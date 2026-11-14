class Solution {
    public int findJudge(int n, int[][] trust) {
        int id[]=new int[n+1];
        int od[]=new int[n+1];
  
        for(int i=0;i<trust.length;i++){
                id[trust[i][1]]++;
                od[trust[i][0]]++;
        }
        for(int i=1;i<od.length;i++){
            if(id[i]==n-1 && od[i]==0) return i;
            }
    return -1;
    }
}