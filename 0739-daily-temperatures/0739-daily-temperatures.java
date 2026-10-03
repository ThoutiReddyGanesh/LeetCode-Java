class Solution {
    public int[] dailyTemperatures(int[] arr) {
              ArrayList<Integer> al=new ArrayList<>();
Stack<Integer> st=new Stack<>();

for(int i=arr.length-1;i>=0;i--){
    while(!st.isEmpty()&&arr[i]>=arr[st.peek()])
        st.pop();

    if(st.isEmpty())
        al.add(0,0);
    else
        al.add(0,st.peek()-i);

    st.push(i);
}int ans[]=new int[al.size()];
    for(int k=0;k<al.size();k++)
            ans[k]=al.get(k);

        return ans;}
}