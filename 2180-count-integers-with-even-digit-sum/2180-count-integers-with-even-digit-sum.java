class Solution {
    public int countEven(int num) {
            int count = 0;
        
        for(int i = 2; i <= num; i++) {
            if(isEven(i)) count++;
        }
		
        return count;
    }
    
    public static boolean isEven(int num) {
        int sum = 0;
        
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return sum % 2 == 0 ? true : false;
    }
}
class Main{
    public static void main(String nums[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Solution s=new Solution();
        System.out.print(s.countEven(num));
    }
}