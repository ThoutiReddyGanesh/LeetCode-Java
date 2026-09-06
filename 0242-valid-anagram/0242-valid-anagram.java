import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char a1[]=s.toCharArray(); Arrays.sort(a1);
        char a2[]=t.toCharArray(); Arrays.sort(a2);
       
        if(Arrays.equals(a1,a2)) return true;
        return false;
    }
}