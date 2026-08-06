class Solution {
    public int smallestNumber(int n, int t) {
       while(true){
        if(Product(n) % t == 0){
            return n;
        }
        n++;
       }
    }
    private int Product(int num){
        int prod = 1;
        while(num > 0){
            int rem = num % 10;
            prod = prod * rem;
            num = num / 10;
        }
        return prod;
    }
}