class Solution {
    public double findMedianSortedArrays(int[] a,int[] b) {
        int arr[]=new int[a.length+b.length];
        int i=0,j=0,k=0;

        while(i<a.length&&j<b.length){
            if(a[i]<b[j])
                arr[k++]=a[i++];
            else
                arr[k++]=b[j++];
        }

        while(i<a.length)
            arr[k++]=a[i++];

        while(j<b.length)
            arr[k++]=b[j++];

        int n=arr.length;

        if(n%2==0)
            return (arr[n/2-1]+arr[n/2])/2.0;
        else
            return arr[n/2];
    }
}