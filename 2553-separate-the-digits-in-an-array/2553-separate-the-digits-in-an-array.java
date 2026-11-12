class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            ArrayList<Integer> temp=new ArrayList<>();
            while(n!=0){
                int rem=n%10;
                temp.add(rem);
                n=n/10;
            }
            for(int j=temp.size()-1;j>=0;j--)
                al.add(temp.get(j));
        }
        int arr[]=new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        return arr;
    }
}