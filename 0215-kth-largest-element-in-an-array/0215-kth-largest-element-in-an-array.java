class Solution {
    public int findKthLargest(int[] nums, int k) {
       Arrays.sort(nums) ;
        // for(int i=0;i<nums.length-k;i++){
        // }
        return nums[nums.length-k];
    }
}