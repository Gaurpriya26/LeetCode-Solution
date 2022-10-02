class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> ch = new HashSet<>();
        for(int i=0;i<s.length();i++)
            ch.add(s.charAt(i));
        for(char i='Z';i>='A';i--){
            if(ch.contains(i) && ch.contains(Character.toLowerCase(i)))
              return Character.toString(i);
         
    }
         return "";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution so=new Solution();
        System.out.print(so.greatestLetter(s));
    }
}