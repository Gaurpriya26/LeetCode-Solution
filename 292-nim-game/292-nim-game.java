class Solution {
    public boolean canWinNim(int n) {
    return (n%4!=0);
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        System.out.print(s.canWinNim(n));
    }
}