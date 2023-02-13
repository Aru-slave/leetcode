class Solution {
    public int[] countBits(int n) {
        int dp[] = new int[n+1];
        dp[0]=0;
        int index = 0;
        int nextbit = 2;
        for(int i=1; i <= n ; i++){
            if(i == nextbit){
                index = nextbit;
                nextbit = 2*nextbit;
                dp[i] = 1;
            }
            else{
                dp[i] = 1 + dp[i-index];
            }
        }
        return dp;
    }
}