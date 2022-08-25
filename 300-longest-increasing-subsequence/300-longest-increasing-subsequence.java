class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length+1];
        int res=1;
        for(int i=1;i<=nums.length;i++){
             dp[i]=1;
            int com=nums[i-1];
            for(int j=0;j<i-1;j++){
                if(nums[j]<com)
                    dp[i]=Math.max(dp[i],dp[j+1]+1);
            }
            res= Math.max(res,dp[i]);
        }
        return res;
    }
}
class Main{
    public static void main(String args[]){
        int[] nums=new int[2500];
        Solution s=new Solution();
        System.out.print(s.lengthOfLIS(nums));
    }
}