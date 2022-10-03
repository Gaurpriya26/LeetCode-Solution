class Solution {
    public int minCost(String colors, int[] neededTime) {
        int min=0,currMax=0;
        for(int i=0;i<colors.length();++i){
            if(i>0 && colors.charAt(i-1)!=colors.charAt(i)){
                currMax=0;
            }
                min+=Math.min(currMax,neededTime[i]);
                currMax=Math.max(currMax,neededTime[i]);
        }
        return min;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String colors=sc.nextLine();
        int[] neededTime=new int[100000];
        Solution s=new Solution();
        System.out.print(s.minCost(colors,neededTime));
    }
}