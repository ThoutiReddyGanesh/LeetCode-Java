class Solution {
    public int[] diStringMatch(String s) {
        
        int i=0;
        int n=s.length();
        int arr[]=new int[n+1];
        int k=0;
        while(k<s.length()){
            if(s.charAt(k)=='I'){
                arr[k]=i;
                i++;}
            else{
                arr[k]=n; 
                n--;
            }
            k++;
            }
            arr[arr.length-1]=i;
            return arr;
        }
    }