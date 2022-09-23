class Solution {
    private static long mod = 1000000007;

    public static int concatenatedBinary(int n) {
        long ans = 0;
        for (int num = 1; num <= n; num++) {
            int value = num;
            while (value != 0) {
                value = value >> 1;
                ans = (ans << 1) % mod;
            }
            ans = (ans + num) % mod;
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