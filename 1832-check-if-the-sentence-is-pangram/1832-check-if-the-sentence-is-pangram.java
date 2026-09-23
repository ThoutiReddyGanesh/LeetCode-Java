class Solution {
    public boolean checkIfPangram(String sentence) {

        int arr[]=new int[26];
        for(int i=0;i<sentence.length();i++){
            int x=sentence.charAt(i)-'a';
            arr[x]++;
            }

        for(int i=0;i<26;i++){
            if(arr[i]==0){
                return false;}
        }
        return true;
    }
}