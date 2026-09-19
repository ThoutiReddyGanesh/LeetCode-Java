class Solution {
    public boolean isValid(String s) {

        Stack<Character> st=new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
                continue;
            }
            if(c==')' && st.size()>0 && st.peek()=='('){
                st.pop();
            }
            else if(c=='}' && st.size()>0 && st.peek()=='{'){
                st.pop();
            }
             else if(c==']' && st.size()>0 && st.peek()=='['){
                st.pop();
            }
            else{
                return false;
            }
        }
            if(st.isEmpty()) return true ;
            return false;
        }
    }