class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int arr[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
                arr[i]=a[i];
        for(int i=0;i<b.length;i++)
                arr[a.length+i]=b[i];

        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0)
        return (arr[n/2-1]+arr[n/2])/2.0;
        else return arr[n/2];
    }
}