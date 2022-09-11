class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int price=prices[0],profit=0;
       for(int i=0;i<prices.length;i++) {
         profit =Math.max(profit,prices[i]-min);
         min=Math.min(min,prices[i]);
       } 
            return profit;
    }
}
class Main{
    public static void main(String args[]){
        Solution s=new Solution();
        int[] prices=new int[100000];
        System.out.print(s.maxProfit(prices));
    }
}