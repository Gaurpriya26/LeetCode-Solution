class Solution {
    public int lengthOfLastWord(String s) {
        String p=s.trim();
        char[] a= p.toCharArray();
        int count=0;
        for(int i=p.length()-1; i>=0;i--){
            if(a[i]==' ')
              break;
            else
                count++;
        }
        return count;
    }
}
