class Solution {
    static int solve(int[] arr,int st,int end){
       if(st >= end) return st;
       
        int mid = st + (end - st) / 2;

        if(arr[mid] > arr[mid + 1]){
            return solve(arr,st,mid);
        }else{ 
            return solve(arr,mid + 1,end);
        }
    //    return st; 
    }
    public int peakIndexInMountainArray(int[] arr) {
       return solve(arr,0,arr.length-1);
    }
}