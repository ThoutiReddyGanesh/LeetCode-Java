class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        ArrayList <Integer> al=new ArrayList<>();
        while(left<=right && top<=bottom){
        for(int i=left;i<=right;i++)
            al.add(matrix[top][i]);
            top++;
        for(int i=top;i<=bottom;i++)
            al.add(matrix[i][right]);
            right--;
        for(int i=right;i>=left && top<=bottom;i--)
            al.add(matrix[bottom][i]);
            bottom--;
        for(int i=bottom;i>=top && left<=right;i--)
            al.add(matrix[i][left]);
            left++;
        }
    return al;
        

    }
}