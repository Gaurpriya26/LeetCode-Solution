class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }
        return -1;
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[] nums=new int[5000];
        Solution s=new Solution();
        System.out.print(s.search(nums,target));
    }
}