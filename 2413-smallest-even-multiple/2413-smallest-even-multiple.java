class Solution {
    public int smallestEvenMultiple(int n) {
        int i=2;
        for(i=2;i<=n*2;i++){
            if(i%2==0 && i%n==0)
               break;
        }
        return i;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        System.out.print(s.smallestEvenMultiple(n));
    }
}