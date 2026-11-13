class Solution {
    public String reverseOnlyLetters(String s) {
        char a[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(Character.isLetter(a[i]) && Character.isLetter(a[j])){
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
            else if(Character.isLetter(a[i]) && !Character.isLetter(a[j])) j--;
            else if(!Character.isLetter(a[i]) && Character.isLetter(a[j])) i++;
            else{
                i++;
                j--;
            }
        }
        return new String(a);
    }
}