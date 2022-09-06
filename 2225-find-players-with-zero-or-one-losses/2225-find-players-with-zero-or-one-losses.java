class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
     List<List<Integer>> ans= new ArrayList<>();
        HashMap<Integer,Integer> winner= new HashMap<>();
        HashMap<Integer,Integer> loser=new HashMap<>();
        for(int[] n:matches){
            int x=n[0];
            int y=n[1];
            if(!loser.containsKey(y))
                loser.put(y,1);
            else
                loser.put(y,loser.get(y)+1);
            if(!winner.containsKey(x))
                winner.put(x,1);
            else
                winner.put(x,winner.get(x)+1);
        }
        ArrayList<Integer> win=new ArrayList<>();
        ArrayList<Integer> lose=new ArrayList<>();
        for(int key:winner.keySet()){
            if(!loser.containsKey(key))
                win.add(key);
        }
         for(int key:loser.keySet()){
            if((loser.get(key))==1)
                lose.add(key);
        }
        Collections.sort(win);
        Collections.sort(lose);
        
        ans.add(win);
        ans.add(lose);
        return ans;
            
    }
}
class Main{
    public static void main(String args[]){
        int[][] matches=new int[100000][2];
        Solution s=new Solution();
        System.out.print(s.findWinners(matches));
    }
}
    