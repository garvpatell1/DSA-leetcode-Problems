class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
      int n = nums.length;
      int max = Integer.MIN_VALUE;
      
      for(int num : nums){
        if(num > max){
            max = num;
        }
        int end = max;
      }
      int st = 1;
      int ans = -1;
      int end = max;
      while(st <= end){
        int mid = st + (end - st)/2;
        if(isValid(nums,threshold,mid)){
            ans = mid;
            end = mid - 1;
        }else{
            st = mid + 1;
        }
      }
      return ans;
    }
    private boolean isValid(int[] nums,int threshold,int x){
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum += (int)Math.ceil((double) nums[i]/x);
        }
        if(sum <= threshold){
            return true;
        }else{
            return false;
        }
    }
}