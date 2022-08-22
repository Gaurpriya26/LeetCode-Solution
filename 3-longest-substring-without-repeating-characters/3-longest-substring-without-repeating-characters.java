class Solution {
    public int lengthOfLongestSubstring(String s) {
      int start=0,len=0;
       // int end=0;
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            if(map.containsKey(c)){
                while(start<=map.get(c))
                    start++;
            }
               len=Math.max(len,end-start+1);
               map.put(s.charAt(end),end);
        }
               return len;
    }
}
class main{
    public static void main(String args[]){
        Solution so= new Solution();
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(so.lengthOfLongestSubstring(s));
    }
}
