class Solution {
    public int[][] diagonalSort(int[][] mat) {
        for(int col=0;col<mat[0].length-1;col++)
        for(int i=0;i<mat.length;i++){
            int row=0;
            for(int j=col;j<mat[0].length-1 && row<mat.length-1;j++,row++){
                if(mat[row][j]>mat[row+1][j+1]){
                    int temp=mat[row][j];
                    mat[row][j]=mat[row+1][j+1];
                    mat[row+1][j+1]=temp;
                }
            }
        }
           for(int row = 1 ; row < mat.length; row ++){
        for (int i =row ; i < mat.length - 1 ; i++){
            int col = 0;
            for (int j =row;j<mat.length-1 && col<mat[0].length- 1;j++,col ++) {
                if (mat[j][col] > mat[j + 1][col + 1])
                {
                    int temp = mat[j][col];
                    mat[j][col] = mat[j+1][col+1];
                    mat[j+1][col+1] = temp;
                }
            }
        }
    }
        return mat;
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