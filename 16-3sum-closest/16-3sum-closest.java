class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) { 
            
            if (Math.abs(nums[i] + nums[start] + nums[end] - target) < Math.abs(result - target)) {
                result = nums[i] + nums[start] + nums[end];
            }
                if (nums[i] + nums[start] + nums[end] > target) end--;
            else if (nums[i] + nums[start] + nums[end] < target) start++;
            else return target;
            }
        }
        return result;
}
}