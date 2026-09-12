class Solution {
    public boolean isLongPressedName(String name,String typed) {
        int i=0;
        int j=0;
        int s1=name.length();
        int s2=typed.length();

        if(s1>s2) return false;

        while(i<s1 && j<s2) {
            char c1=name.charAt(i);
            char c2=typed.charAt(j);

            if(c1!=c2) return false;

            int count1=1;
            int count2=1;

            while(i+1<s1 && name.charAt(i)==name.charAt(i+1)) {
                count1++;
                i++;}

            while(j+1<s2 && typed.charAt(j)==typed.charAt(j+1)) {
                count2++;
                j++;}

            if(count1>count2) return false;
            i++;
            j++;}

        return i==s1 && j==s2;
    }
}