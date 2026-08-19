class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;

        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0) + 1);
        }

        for(int num : mp.keySet()){
            if(k > 0){
                if(mp.containsKey(num + k)){
                    cnt++;
                }
            }else{
                if(mp.get(num) >= 2) cnt++;
            }
        }
        return cnt++;
    }
}