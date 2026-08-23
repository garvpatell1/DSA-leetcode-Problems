class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int diff = 0;
        int n2 = n/2;
        for(int i=0;i<n;i++){
            char c = num.charAt(i);
            boolean isQuestion = (c == '?');
            int firstHalf = (i < n2) ? 1:-1;
            int digit;

            if(isQuestion){
                digit = 9;
            }else{
                digit = (c - '0') * 2;
            }
            diff += firstHalf * digit;
        }
        return diff != 0;
    }
}