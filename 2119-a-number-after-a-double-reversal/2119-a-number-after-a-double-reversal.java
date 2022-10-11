class Solution {
    public boolean isSameAfterReversals(int num) {
        int num1=reverse(num);
        int num2=reverse(num1);
       return num==num2? true:false;
    }
    public int reverse(int num){
        int result=0,r;
        
        while(num!=0){
        r=num%10;
        num=num/10;
        result=(result*10)+r; 
    }
        return result;
    }
}
