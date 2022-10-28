class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> h = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            
            Arrays.sort(ch);
            String str = String.valueOf(ch);
            
            if (!h.containsKey(str)) 
                h.put(str, new ArrayList<>());
            h.get(str).add(s);
            
        }    
        ans.addAll(h.values());
        return ans;   
    }
}
