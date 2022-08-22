class Solution {
    public boolean checkPerfectNumber(int num) {
         int i=1,sum=0;
        
        while(i*i<=num){
            if(num%i==0){
                sum+=i;
                if(i*i!=num){
                    sum+=num/i;
                }
            }
            i++;
        }
        if(sum-num==num)
            return true;
        else
            return false;
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Solution s=new Solution();
        System.out.println(s.checkPerfectNumber(num));
    }
}