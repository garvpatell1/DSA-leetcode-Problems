class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        int st = 1;
        int end = (int)1e9;
        int speed = -1;

        while(st <= end){
            int mid = st + (end - st)/2;
            double timeTaken = 0;
            for(int i=0;i<n;i++){
                if(i != n-1){
                    timeTaken += Math.ceil((double)dist[i]/mid);
                }else{
                    timeTaken += (double)dist[i]/mid;
                }
            }
            if(timeTaken > hour){
                st = mid + 1;
            }else{
                speed = mid;
                end = mid - 1;
            }
        }
        return speed;
    }
}