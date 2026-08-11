class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int st = 0;
        int end = 0;

        for (int w : weights) {
            st = Math.max(st, w);
            end += w;
        }

        int ans = end;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isValid(weights, days, mid)) {
                ans = mid;
                end = mid - 1; 
            } else {
                st = mid + 1; 
            }
        }

        return ans;
    }

    private boolean isValid(int[] weights, int days, int capacity) {
        int requiredDays = 1;
        int currentWeight = 0;

        for (int w : weights) {
            if (currentWeight + w > capacity) {
                requiredDays++;
                currentWeight = w;
            } else {
                currentWeight += w;
            }
        }
        return requiredDays <= days;
    }
}