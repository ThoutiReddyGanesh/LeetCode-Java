class Solution {
 String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    void fun(String str,int idx,String ans,ArrayList<String> al){

        if(idx>=str.length()){
            al.add(ans);
            return;
        }
        String n=arr[str.charAt(idx)-'0'];
        for(int i=0;i<n.length();i++){
            fun(str,idx+1,ans+n.charAt(i),al);
        }
    }


    public List<String> letterCombinations(String str) {
       ArrayList<String> al=new ArrayList<>();
        fun(str,0,"",al); return al;
        
    }
}
