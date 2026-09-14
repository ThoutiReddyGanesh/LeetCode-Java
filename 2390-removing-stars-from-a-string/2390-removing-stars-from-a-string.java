class Solution {
    public String removeStars(String s) {

        StringBuilder a=new StringBuilder(s);

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='*'){
                a.delete(i-1,i+1);
                i=i-2;
            }
        }

        return a.toString();
    }
}