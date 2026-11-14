class Solution {
    public int[] findDegrees(int[][] matrix) {
        int ans[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int in=0;
            int out=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[j][i]==1) in++;
                if(matrix[i][j]==1) out++;
            }
            ans[i]=out;
        }
        return ans;
    }
}