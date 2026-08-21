class Solution {
    public int numRescueBoats(int[] people, int limit) {
       int boatCnt = 0;
       int n = people.length;
       Arrays.sort(people);
       int left = 0;
       int right = n - 1;

       while(left <= right){
        int sum = people[left] + people[right];

        if(sum <= limit){
            boatCnt++;
            left++;
            right--;
        }else{
            boatCnt++;
            right--;
        }
       }
       return boatCnt;
    }
}