class Solution {
    public String removeDuplicates(String s) {
      Stack<Character> st=new Stack<>();
      int i=0;
      st.push(s.charAt(i));
      i++;
      while(i<s.length()){
        if(st.size()>0 && s.charAt(i)==st.peek()){
            st.pop();
            i++;}
        else{
            st.push(s.charAt(i));
            i++;
        }
        }
        String b="";
        for(char x:st){
            b=b+x;
        }
        return b;
      }
}