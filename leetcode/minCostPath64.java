class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length ==0){
            return 0;
        }
        
        int[][] dp = new int[grid.length][grid[0].length];
        
        for(int i = dp.length-1; i>=0; i--){
            for(int j = dp[0].length -1; j>=0; j--){
                //destination or last element
                if(i== dp.length-1 && j== dp[0].length-1){
                    dp[i][j] = grid[i][j];
                }
                //last row 
                else if(i== dp.length-1){
                    dp[i][j] = dp[i][j+1] + grid[i][j];
                }
                //last col
                else if(j== dp[0].length-1){
                    dp[i][j] = dp[i+1][j] + grid[i][j];
                }
                // normal case or middle elements
                else{
                    dp[i][j] = Math.min(dp[i][j+1],dp[i+1][j]) + grid[i][j];
                }
            }
        }
        
       return dp[0][0];
        
    }
}