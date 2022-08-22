class Solution {
    public int search(int[] nums, int target) {
         int f= 0;
            int l=nums.length-1;
            
        while(f<=l){
            int m=(f+l)/2;
             if(target==nums[m]){
                 return m;
             }
             else if(target>nums[m]){
                 f=m+1;
             }
            else if(target<nums[m]){
                l=m-1;
            }
       
        }
        return -1;
        
    }
}
public class mycode{
  public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      Solution s= new Solution();
      int[] nums= new int[10000];
      int target= sc.nextInt();
     int result= s.search(nums, target);
      if(result==-1)
          System.out.print(-1);
      
      else
          System.out.print(result);
      
  }
}