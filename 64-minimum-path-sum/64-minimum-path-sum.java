class Solution {
    public int minPathSum(int[][] grid) {
              int m = grid.length;
        int n = grid[0].length;
        
        int[][] dp = new int[m][n];
        
        return minPathSumHelper(grid, m-1, n-1, dp);
    }
    
    public int minPathSumHelper(int[][] grid, int i, int j, int[][] dp) {
        if(i==0 && j==0){
            return grid[0][0];
        } 
        
        if(i<0 || j<0){
            return 20004;
        }
        
        if(dp[i][j]!=0) return dp[i][j];

        
        int left = grid[i][j] + minPathSumHelper(grid, i, j-1, dp);
        int up = grid[i][j] + minPathSumHelper(grid, i-1, j, dp);
        
        return dp[i][j] = Math.min(left,up);
    }
}
class Main{
    public static void main(String args[]){
        int m=200,n=200;
        int[][] grid=new int[m][n];
        Solution s=new Solution();
        System.out.print(s.minPathSum(grid));
    }
}