class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
    for(int i=0;i<nums.length;i++){
        if(i>max) return false;
        max=Math.max(nums[i]+i,max);
    }
        return true;
    }
    public void main(String args[]){
        int[] nums=new int[10000];
        System.out.print(canJump(nums));
    }
}