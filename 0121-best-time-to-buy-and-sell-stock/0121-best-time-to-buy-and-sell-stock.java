class Solution {
    public int maxProfit(int[] prices) {
        int Best = prices[0];
        int maxDiff = 0;

        for(int j = 0;j<prices.length;j++){
            if(prices[j] < Best){
                Best = prices[j];
            }else{
                maxDiff = Math.max(maxDiff,prices[j]-Best);
            }
        }
        return maxDiff;
    }
}