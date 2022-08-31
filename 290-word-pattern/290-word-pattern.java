class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n =pattern.length();
        List a=Arrays.asList(s.split(" "));
       if(a.size()!=n)
           return false;
        for(int i=0;i<n;i++){
            if(pattern.indexOf(pattern.substring(i,i+1))!=a.indexOf(a.get(i)))
                return false;
        }
        return true;
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String pattern=sc.nextLine();
        String s=sc.nextLine();
        Solution so=new Solution();
        System.out.print(so.wordPattern(pattern,s));
    }
}
