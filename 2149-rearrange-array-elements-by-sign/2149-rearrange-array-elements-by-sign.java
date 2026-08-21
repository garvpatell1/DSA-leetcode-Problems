class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int num : nums){
            if(num > 0) pos.add(num);
            else neg.add(num);
        }
        int[] res = new int[nums.length];
        int pIdx = 0;
        int nIdx = 0;

        for(int i=0;i<res.length;i++){
            if(i % 2 == 0){
                res[i] = pos.get(pIdx++);
            }else{
                res[i] = neg.get(nIdx++);
            }
        }
        return res;
    }
}