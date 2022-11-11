class Solution {
    public int removeDuplicates(int[] nums) {
         HashSet<Integer> hashSet=new HashSet<>();
        for(int element: nums){
           hashSet.add(element);
        }
       Object[] output= hashSet.toArray();
          Arrays.sort(output);
        int  count=0;
        for(int i=0; i<output.length;i++){
             nums[count] = (int) output[i];
          count++;
    }
                  

           return(count);
}
 
}
class Main{
    public static void main(String[] args){
        int[] nums=new int[30000];
        Solution s= new Solution();
        System.out.println(s.removeDuplicates(nums));
    }
    }