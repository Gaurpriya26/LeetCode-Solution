class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int lastSpace=-1;
        for(int strIndex=0;strIndex<=s.length();strIndex++){
            if(strIndex==s.length() || arr[strIndex]==' '){
            int start=lastSpace+1;
            int end=strIndex-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
         lastSpace=strIndex;
    }
}
        return new String(arr);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution so=new Solution();
        System.out.print(so.reverseWords(s));
    }
}