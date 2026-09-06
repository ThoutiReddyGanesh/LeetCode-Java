import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char a1[]=s.toCharArray(); Arrays.sort(a1);
        char a2[]=t.toCharArray(); Arrays.sort(a2);
        String result1=new String(a1);
        String result2=new String(a2);
        if(result1.equals(result2)) return true;
        return false;
    }
}