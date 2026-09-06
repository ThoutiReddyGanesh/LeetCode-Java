class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        String t=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i=t.length()-1;i>=0;i--){
            a=a+t.charAt(i);}

        if(t.equals(a)){
        return true;}
        return false;
    }
}