class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for(int right=0;right<n;right++){
            mp.put(nums[right],mp.getOrDefault(nums[right],0) + 1);

            while(mp.get(nums[right]) > k){
                mp.put(nums[left], mp.get(nums[left]) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}