class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount +1];
        Arrays.fill(dp,amount +1); // filling array with 12 if amount is 11 ie one more than amount
        // as this will be helpful in finding min as well as base case in the end of code.
        dp[0] = 0; // we need 0 coins to pay 0 .
        
        for(int i =0 ; i<= amount; i++){
            for(int coin : coins){
                if(coin <= i){
                    dp[i] = Math.min(dp[i],1 + dp[i-coin]);
                }
            }
        }
        
        return dp[amount] > amount ? -1 : dp[amount];
        
    }
}