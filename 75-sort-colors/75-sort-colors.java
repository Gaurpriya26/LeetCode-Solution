class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
int num0 = 0, num1 = 0, num2 = 0;
    
    for(int i = 0; i < n; i++) {
        if (nums[i] == 0) ++num0;
        else if (nums[i] == 1) ++num1;
        else if (nums[i] == 2) ++num2;
    }
    
    for(int i = 0; i < num0; ++i) nums[i] = 0;
    for(int i = 0; i < num1; ++i) nums[num0+i] = 1;
    for(int i = 0; i < num2; ++i) nums[num0+num1+i] = 2;
    }
    public static void main(String args[]){
        int[] nums=new int[300];
        Solution s=new Solution();
        s.sortColors(nums);
    }
}
