class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     int[] hash=new int[26];
        for(char c:magazine.toCharArray())
            ++hash[c-'a'];
        for(char c: ransomNote.toCharArray())
            if(--hash[c-'a']<0)
                return false;
        return true;
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ransomNote=sc.nextLine();
        String magazine=sc.nextLine();
        Solution s=new Solution();
        System.out.print(s.canConstruct(ransomNote,magazine));
    }
}