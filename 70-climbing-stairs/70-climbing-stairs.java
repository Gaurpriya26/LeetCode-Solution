class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int a[]=new int[50];
        a[2]=2;
        a[3]=3;
        for(int i=4; i<=n;i++ ){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
        
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        System.out.print(s.climbStairs(n));
    }
}
