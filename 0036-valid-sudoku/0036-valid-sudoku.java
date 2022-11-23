class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen=new HashSet();
        for(int i=0;i<9;++i){
            for(int j=0;j<9;++j){
                char n=board[i][j];
                if(n != '.')
                    if(!seen.add(n + "in row"+ i) ||
                       !seen.add(n + "in column" + j) || 
                       !seen.add(n + "in block" + i/3 +"-" + j/3))
                      return false;
        }
        }
            return true;
    }
}

