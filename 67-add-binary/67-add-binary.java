class Solution {
    public String addBinary(String a, String b) {
       if(a==null || a.isEmpty()) return b;
        if(b==null || b.isEmpty()) return a;
        int x=a.length()-1;
        int y=b.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();
        while(x>-1 || y>-1){
            int sum=carry;
            if(x>=0) sum+= a.charAt(x--)-'0';
            if(y>=0) sum+= b.charAt(y--)-'0';
            res.append(sum%2);
            carry=sum/2;
        }
        if(carry==1) res.append(carry);
        return  res.reverse().toString();
    }
}
class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in) ;
        String a=sc.nextLine();
        String b=sc.nextLine();
        Solution s=new Solution();
        System.out.print(s.addBinary(a,b));
    }
}
