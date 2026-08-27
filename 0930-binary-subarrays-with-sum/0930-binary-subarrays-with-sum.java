class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int[] prefixCnt = new int[nums.length + 1];
        prefixCnt[0] = 1;
        int sum = 0;
        int totalSubarray = 0;

        for(int num : nums){
            sum += num;

            if(sum >= goal){
                totalSubarray += prefixCnt[sum - goal];
            }
            prefixCnt[sum]++;
        } 
        return totalSubarray;
    }
}

