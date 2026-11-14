class Solution {
    void fun(int mat[][],int i,int j,int prev,int color){
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length )return ;
        if(prev!=mat[i][j]) return;
        mat[i][j]=color;
        fun(mat,i+1,j,prev,color);
        fun(mat,i,j+1,prev,color);
        fun(mat,i-1,j,prev,color);
        fun(mat,i,j-1,prev,color);
        }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prev=image[sr][sc];
        if(prev==color) return image;
        fun(image,sr,sc,prev,color);
        return image;
    }
}
        
        