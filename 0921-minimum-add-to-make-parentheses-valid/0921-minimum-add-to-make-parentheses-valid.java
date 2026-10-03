class Solution {
    public int minAddToMakeValid(String s) {
        int i=0;
      
            while(s.contains("()"))
                s=s.replace("()","");

        
        return s.length();
    }
}