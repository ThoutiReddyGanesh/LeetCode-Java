class Solution {
    int f=0;
      void fun(int  grid[][],int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){ f=1;return;}
        if(grid[i][j]==1)return;
        grid[i][j]=1;
        fun(grid,i+1,j);
        fun(grid,i-1,j);
        fun(grid,i,j+1);
        fun(grid,i,j-1);
    }
    public int closedIsland(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    fun(grid,i,j);
                    if(f==0)c++;
                }
                f=0;
            }
        }
        return c;
    }
}

