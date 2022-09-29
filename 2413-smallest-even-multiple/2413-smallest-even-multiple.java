class Solution {
    public int smallestEvenMultiple(int n) {
       if(n%2==0)
           return n;
        else
            return n*2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        System.out.print(s.smallestEvenMultiple(n));
    }
}