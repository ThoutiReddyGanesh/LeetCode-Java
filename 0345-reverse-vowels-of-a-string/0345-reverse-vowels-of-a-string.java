class Solution {
    public String reverseVowels(String s) {
        String v="aeiouAEIOU";
        char [] a=s.toCharArray();
        int i=0;int j=s.length()-1;
        while(i<=j){
            if(v.indexOf(a[i])==-1)
            i++;
            else if (v.indexOf(a[j])==-1)
            j--;
            else {
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
        return new String(a);
    
}
}
