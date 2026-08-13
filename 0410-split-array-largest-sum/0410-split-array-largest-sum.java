class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int s = 0;
        int e = 0;

        for(int num : nums){
            s = Math.max(s,num);
            e += num;
        }
        int ans = e;

        while(s <= e){
            int mid = s + (e - s)/2;
            if(isValid(nums,k,mid)){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
    private boolean isValid(int[] nums,int k,int maxSum){
        int cnt = 0;
        int currSum = 0;

        for(int num : nums){
            if(currSum + num > maxSum){
                cnt++;
                currSum = num;
            }else{
                currSum += num;
            }
        }
        return cnt < k;
    }
}