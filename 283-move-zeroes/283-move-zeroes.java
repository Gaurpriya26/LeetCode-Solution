class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=0)   {
              nums[j]=nums[i];
              j++;
           } 
        }
        for(int i=j; i<nums.length;i++){
            nums[i]=0;
        }
    }
}
class main{
    public static void main(String args[]){
        int[] nums=new int[10000];
        Solution s=new Solution();
        s.moveZeroes(nums);
    }
}