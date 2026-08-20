class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] st = new int[n];
        int top = 0;

        for(int i=0;i<n;i++){
            if(nums[i] < nums[st[top]]){
                st[++top] = i;
            }
        }
        int maxWidth = 0;
        for(int j=n-1;j>=0;j--){
            while(top >= 0 && nums[j] >= nums[st[top]]){
                maxWidth = Math.max(maxWidth, j - st[top--]);
            }
        }
        return maxWidth;
    }
}