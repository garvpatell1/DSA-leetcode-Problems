class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st = 1;
        int end = 0;

        for(int pile : piles){
            end = Math.max(end,pile);
        }

        int result = end;
        while(st <= end){
            int mid = st + ( end - st) / 2;
            if(canEatAll(piles,h,mid)){
                result = mid;
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return result;
    }

    private boolean canEatAll(int[] piles,int h,int k){
        long totalHours = 0;
        for(int pile : piles){
            totalHours += (pile + k - 1) / k;
        }
        return totalHours <= h;
    }
}