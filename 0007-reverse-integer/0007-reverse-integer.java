class Solution {
    public int reverse(int x) {
        int res = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while(x != 0){
            int rem = x % 10;
            x = x / 10;

            if(res > max/10 || res < min/10){
                return 0;
            }else if(res == max || res == min){
                return 0;
            }else{
                res = (res * 10) + rem;
            }
        }
        return res;
    }
}