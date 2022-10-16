class Solution {
    public int maxArea(int[] height) {
        int max=0; 
        int shortest=0;
        int start=0, end=(height.length-1);
        while(start<end){
             shortest=Math.min(height[start],height[end]);
            max= Math.max(max,shortest*(end-start));
            if(shortest==height[end]){
                end--;
            }
            else{
                start++;
            }
        
        }
        return max;
    }
}
class main{
    public static void main(String args[]){
        Solution s=new Solution();
        Scanner sc= new Scanner(System.in);
        int[] height= new int[10000];
        System.out.print(s.maxArea(height));
    }
}