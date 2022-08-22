class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++ ){
            int front=i;
            int back=s.length-1-i;
            char frontChar= s[front];
             char backChar=s[back];
            s[front]= backChar;
            s[back]= frontChar;
        }
        System.out.print(s);
    }
}
class main{
    public static void main(String args[]){
        Solution a=new Solution();
        Scanner sc=new Scanner(System.in);
        char[] s=sc.next().toCharArray();
        a.reverseString(s);
    }
}