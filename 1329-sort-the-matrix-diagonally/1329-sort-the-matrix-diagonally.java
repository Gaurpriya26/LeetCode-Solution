class Solution {
 public int[][] diagonalSort(int[][] mat) {
       int m=mat.length;
        int n=mat[0].length;
        
        //row=0
        for(int col=0;col<n;col++){
            sort(mat,0,col,m,n);
        }
        
        //col=0
        for(int row=1;row<m;row++){
            sort(mat,row,0,m,n);
        }
        
        return mat;
    }
    
    void sort(int[][] mat,int row,int col,int m,int n){
        List<Integer> values=new ArrayList<>();
        int r=row,c=col;
        while(r<m && c<n){
            values.add(mat[r][c]);
            r++;
            c++;
        }
        
        Collections.sort(values);
        
        r=row;
        c=col;
        int ind=0;
        while(r<m && c<n){
            mat[r][c]=values.get(ind++);
            r++;
            c++;
        }
    }

}
class Main{
    public static void main(String args[]){
        int m=100,n=100;
        int[][] mat=new int[m][n];
        Solution s=new Solution();
        System.out.print(s.diagonalSort(mat));
    }
}
//     for(int col = 0 ; col < n -1  ; col++)
//     {
        
//         for(int i = 0 ; i < m ; i++)
//         {
//             int row = 0;
            
//             for(int j = col ; j < n - 1 && row < m - 1 ; j++ , row++)
//             {