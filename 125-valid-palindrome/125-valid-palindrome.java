class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0)  return true;
        int start=0, end=s.length()-1;
        char cHead,cTail;
        while(start<=end){
            cHead=s.charAt(start);
            cTail=s.charAt(end);
            if(!Character.isLetterOrDigit(cHead))
                start++;
            else if(!Character.isLetterOrDigit(cTail)){
                end--;
        }
            else{
                if(Character.toLowerCase(cHead)!=Character.toLowerCase(cTail))
                    return false;
            start++;
            end--;
            }
        }
        return true;
    }
    public static void main(String args[]){ 
      Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution so=new Solution();
        System.out.print(so.isPalindrome(s));
    }
}
