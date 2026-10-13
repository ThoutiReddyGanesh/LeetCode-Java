class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       for(int i=0;i<image.length;i++){
            ArrayList <Integer> al=new ArrayList<>();
            for(int j=0;j<image[i].length;j++){
                al.add(image[i][j]);
            }
            Collections.reverse(al);
            for(int j=0;j<image[i].length;j++){
             image[i][j]=1-al.get(j);
            }
       }
       return image;

    }
}