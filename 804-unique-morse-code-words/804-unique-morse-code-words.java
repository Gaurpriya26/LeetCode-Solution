class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    HashSet<String> set=new HashSet<>();
    for(String values:words){
        StringBuilder x=new StringBuilder();
        for(char c: values.toCharArray())
             x.append(morse[c-'a']);
        set.add(x.toString());
    }
    return set.size();
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] words=new String[100];
        Solution s=new Solution();
        System.out.print(s.uniqueMorseRepresentations(words));
}
}