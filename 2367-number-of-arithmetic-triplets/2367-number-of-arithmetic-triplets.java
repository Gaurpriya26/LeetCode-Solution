class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((nums[j]-nums[i])==diff && (nums[k]-nums[j])==diff){
                        ans++;
                }
            }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int diff=sc.nextInt();
        int[] nums=new int[200];
        Solution s=new Solution();
        System.out.print(s.arithmeticTriplets(nums,diff));
    }
}