class Solution {
    public int fib(int n) {
        int f=0,s=1;
        if(n==0) return 0;
        int t=f+s;
        for(int i=0;i<=n-2;i++){
            t=f+s;
            f=s;
            s=t;
        }
       return t;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s= new Solution();
        System.out.print(s.fib(n));
    }
}