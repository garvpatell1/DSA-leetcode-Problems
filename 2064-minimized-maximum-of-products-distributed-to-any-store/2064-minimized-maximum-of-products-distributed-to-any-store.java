class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int s = 1;
        int e = 0;
        for(int m : quantities){
            e = Math.max(e,m);
        }
        int ans = e;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(isValid(n,quantities,mid)){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
    private boolean isValid(int n,int[] quantities,int item){
        int storeCnt = 0;
        if(item == 0) return false;

        for(int prod : quantities){
            storeCnt += (prod + item - 1) / item;
        } 
        return storeCnt <= n;
    }
}