class Solution{
    public boolean isValid(String s){
        StringBuilder sb=new StringBuilder(s);
        int c=0;
        while(sb.toString().contains("abc")){
            c++;
            int pos=sb.toString().indexOf("abc");
            sb.delete(pos,pos+3);
        }
        return sb.length()==0;
    }
}