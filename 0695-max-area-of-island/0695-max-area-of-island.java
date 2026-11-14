class Solution {
    int c=0;
    void fun(int grid[][],int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return;
        if(grid[i][j]==0)return;
        grid[i][j]=0;
        c++;
        fun(grid,i+1,j);
        fun(grid,i-1,j);
        fun(grid,i,j+1);
        fun(grid,i,j-1);
    }
    public int maxAreaOfIsland(int[][] grid) {
         int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                     c=0;
                    fun(grid,i,j);
                    if(c>max)max=c;
                }
            }
        }
        return max;
    }
}