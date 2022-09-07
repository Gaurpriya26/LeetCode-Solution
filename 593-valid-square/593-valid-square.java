class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
    HashSet<Integer> set=new HashSet<>();
        if(isSame(p1,p2)|| isSame(p1,p3)|| isSame(p1,p4)|| isSame(p2,p3)|| isSame(p2,p4)|| isSame(p3,p4))
            return false;
        set.add(dist(p1,p2));
         set.add(dist(p1,p3));
         set.add(dist(p1,p4));
         set.add(dist(p2,p3));
         set.add(dist(p2,p4));
         set.add(dist(p3,p4));
        return set.size()==2;
    }
    private int dist(int[] p1,int[] p2){
        return(p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
    }
    private boolean isSame(int[] p1,int[] p2){
        return p1[0]==p2[0] && p1[1]==p2[1];
    }
}
class Main{
    public static void main(String args[]){
        int[] p1= new int[2];
         int[] p2= new int[2];
         int[] p3= new int[2];
         int[] p4= new int[2];
        Solution s=new Solution();
        System.out.print(s.validSquare(p1,p2,p3,p4));
        
    }
}