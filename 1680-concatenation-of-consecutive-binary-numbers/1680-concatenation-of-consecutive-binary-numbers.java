class Solution {
    public static int concatenatedBinary(int n) {
        long mod = 1000000007;
        long ans = 0;
        int size=0;
        for (int i= 1; i <= n; i++) {
           if((i& (i-1))==0) size++;
            ans=(ans<<size|i)%mod;
        }
        return (int)ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        System.out.print(s.concatenatedBinary(n));
    }
}