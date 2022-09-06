class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1])
                return false;
        }
        return true;
    }
}
class Main{
    public static void main(String args[]){
        int[] nums=new int[1000];
        Solution s=new Solution();
        System.out.print(s.divideArray(nums));
    }
}