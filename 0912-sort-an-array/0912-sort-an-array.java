class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
        }
void divide(int a[],int start,int end){
    if(start<end){
        int mid=start+(end-start)/2;
        divide(a,start,mid);
        divide(a,mid+1,end);
        merge(a,start,mid,end);
    }
}

void merge(int a[],int start,int mid,int end){
    int n=mid-start+1;
    int m=end-mid;
    int left[]=new int[n];
    int right[]=new int[m];
    
    for(int i=0;i<n;i++) left[i]=a[start+i];
    for(int j=0;j<m;j++) right[j]=a[mid+1+j];

    int i=0,j=0,k=start;

    while(i<n && j<m){
        if(left[i]<=right[j]){
            a[k]=left[i];
            i++;}
        else{
            a[k]=right[j];
            j++;}
        k++;
    }
    while(i<n){
        a[k]=left[i];
            i++;
            k++;}
    while(j<m){
        a[k]=right[j];
            j++;
            k++;}
    }   
}