class Solution {
    public int countElements(int[] nums) {
        int arr[]=nums.clone();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int c=0;
        if(nums.length<=2) return 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min && arr[i]<max) 
                c++;
        }
    return c; 
    }
}