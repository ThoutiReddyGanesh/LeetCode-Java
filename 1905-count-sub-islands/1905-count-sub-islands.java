/*class Solution {
    void fun(int grid[][],int i,int j,ArrayList<String> al){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return;
        if(grid[i][j]==0) return;
        al.add(i+","+j);
        grid[i][j]=0;
        fun(grid,i+1,j,al);
        fun(grid,i-1,j,al);
        fun(grid,i,j+1,al);
        fun(grid,i,j-1,al);
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        ArrayList<ArrayList<String>> ans1=new ArrayList<>();
        ArrayList<ArrayList<String>> ans2=new ArrayList<>();
        for(int i=0;i<grid1.length;i++){
            for(int j=0;j<grid1[0].length;j++){
                if(grid1[i][j]==1){
                    ArrayList<String> al=new ArrayList<>();
                    fun(grid1,i,j,al);
                    ans1.add(al);
                }
            }
        }
    int c=0;
    for(int i=0;i<grid2.length;i++){
        for(int j=0;j<grid2[0].length;j++){
            if(grid2[i][j]==1){
                ArrayList<String> al=new ArrayList<>();
                fun(grid2,i,j,al);
                ans2.add(al);
            }
        }
    }
    for(int i=0;i<ans2.size();i++){
            for(int j=0;j<ans1.size();j++){
                if(ans1.get(j).containsAll(ans2.get(i))){
                    c++;
                    break;
                }
            }
        }
    return c;
    }
}*/
/*
class Solution {
    void fun(int grid[][],int i,int j,ArrayList<String> al){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return;
        if(grid[i][j]==0) return;
        al.add(i+","+j);
        grid[i][j]=0;
        fun(grid,i+1,j,al);
        fun(grid,i-1,j,al);
        fun(grid,i,j+1,al);
        fun(grid,i,j-1,al);
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<grid1.length;i++){
            for(int j=0;j<grid1[0].length;j++){
                if(grid1[i][j]==1){
                    ArrayList<String> al=new ArrayList<>();
                    fun(grid1,i,j,al);
                    hs.addAll(al);
                }
            }
        }
    int c=0;
    for(int i=0;i<grid2.length;i++){
        for(int j=0;j<grid2[0].length;j++){
            if(grid2[i][j]==1){
                ArrayList<String> al=new ArrayList<>();
                fun(grid2,i,j,al);
                if(hs.containsAll(al))
                    c++;
            }
        }
    }
    return c;
    }
}
*/




class Solution {
    boolean flag=false;
    void fun(int grid1[][],int grid2[][],int i,int j){
        if(i<0 || j<0 || i>=grid1.length || j>=grid1[0].length)return;
        if(grid2[i][j]==0)return;
        if(grid2[i][j]==1 && grid1[i][j]==0)flag=true;
        grid2[i][j]=0;
        fun(grid1,grid2,i+1,j);
        fun(grid1,grid2,i-1,j);
        fun(grid1,grid2,i,j+1);
        fun(grid1,grid2,i,j-1);
    }
    public int countSubIslands(int[][] grid1,int[][] grid2){
        int c=0;
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                if(grid2[i][j]==1){
                    flag=false;
                    fun(grid1,grid2,i,j);
                    if(flag==false)c++;
                }
            }
        }
        return c;
    }
}
