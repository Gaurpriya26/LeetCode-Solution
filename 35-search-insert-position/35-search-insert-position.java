class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(i=0;i<nums.length && nums[i]<=target;i++){
            if(target==nums[i])
                return i;
            
        }
        return i;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[10000];
        int target=sc.nextInt();
        Solution s=new Solution();
        System.out.print(s.searchInsert(nums,target));
    }
}