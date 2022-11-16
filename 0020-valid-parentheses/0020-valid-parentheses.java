class Solution {
    public boolean isValid(String s) {
        Stack<Character> c=new Stack<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='(' || a=='[' || a=='{')  c.push(a);
             if(c.isEmpty()) return false;
             else if(c.isEmpty())  return false;
            else if(a==')' && c.pop()!='(')  return false;
            else if(a=='}' && c.pop()!='{')  return false;
            else if(a==']' && c.pop()!='[')  return false;
        
        }
        return c.empty();
    }
}
 