class Solution {
    public int reverseDegree(String s) {
       HashMap<Character, Integer> hm = new HashMap<>();

            for(char i='a';i<='z';i++){
                hm.put(i, 'z'-i+1);}
            int arr[]=new int[s.length()];
            for(int j=0;j<s.length();j++){
                arr[j]=hm.get(s.charAt(j));}
            int sum=0;
            for(int k=0;k<arr.length;k++){
                arr[k]=arr[k]*(k+1);
                sum=sum+arr[k];
            }
            return sum;

    }
}