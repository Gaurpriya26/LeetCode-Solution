class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
       while(n%3==0) {
           n/=3;
       }
        return n==1;
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        System.out.print(s.isPowerOfThree(n));
    }
}