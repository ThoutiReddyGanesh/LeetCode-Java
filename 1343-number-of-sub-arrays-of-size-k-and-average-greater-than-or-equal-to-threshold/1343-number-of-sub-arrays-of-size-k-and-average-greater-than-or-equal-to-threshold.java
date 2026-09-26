class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int total=0;
        int count=0;

        for(int i=0;i<k;i++)
            total=total+arr[i];

        int avg=total/k;

        if(avg>=threshold)
            count++;

        for(int i=k;i<arr.length;i++){
            total=total-arr[i-k]+arr[i];
            avg=total/k;

            if(avg>=threshold)
                count++;
        }

        return count;
    }
}