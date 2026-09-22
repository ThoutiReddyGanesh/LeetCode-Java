class Solution {
    public boolean backspaceCompare(String s,String t) {

        StringBuilder a=new StringBuilder(s);
        StringBuilder b=new StringBuilder(t);

        int i=0;
        int j=0;

        while(j<a.length()) {

            if(a.charAt(j)!='#') {
                i++;
                j++;
            }
            else {
                if(i==0) {
                    a.deleteCharAt(i);
                    i=0;
                    j=0;
                }
                else {
                    i--;
                    a.deleteCharAt(j);
                    a.deleteCharAt(i);
                    i=0;
                    j=0;
                }
            }
        }

        i=0;
        j=0;

        while(j<b.length()) {

            if(b.charAt(j)!='#') {
                i++;
                j++;
            }
            else {
                if(i==0) {
                    b.deleteCharAt(j);
                    i=0;
                    j=0;
                }
                else {
                    i--;
                    b.deleteCharAt(j);
                    b.deleteCharAt(i);
                    i=0;
                    j=0;
                }
            }
        }

        return a.toString().equals(b.toString());
    }
}

