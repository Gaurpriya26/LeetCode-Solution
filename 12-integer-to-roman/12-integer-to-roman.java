class Solution {
    public String intToRoman(int num) {
        String out="";
        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String sym[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;num!=0;i++)
        while(num>=val[i]){
            num-=val[i];
            out+= sym[i];
        }
        return out;
    }
};
class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    Solution s= new Solution();
    System.out.println(s.intToRoman(num));
}
}