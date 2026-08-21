class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int st = 0;
        int end = 0;
        int zeroCnt = 0;

        while(end < n){
            if(nums[end] == 0){
                zeroCnt++;
            }
            end++;
            
            if(zeroCnt > k){
                if(nums[st] == 0){
                    zeroCnt--;
                }
                st++;
            }
        }
        return end - st;
    }
}