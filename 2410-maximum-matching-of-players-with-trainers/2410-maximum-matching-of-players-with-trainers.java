class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0,ans=0;
        while(i<players.length && j<trainers.length){
         if(players[i]<=trainers[j])  {
             i++; 
             j++; 
             ans++;
         }
            else
                j++;
        }
        return ans;
    }
    public static void main(String args[]){
        int[] players=new int[100000];
        int[] trainers=new int[100000];
        Solution s=new Solution();
        System.out.print(s.matchPlayersAndTrainers(players,trainers));
    }
}
