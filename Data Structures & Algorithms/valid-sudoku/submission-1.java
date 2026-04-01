class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i  = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] == '.'){
                     continue;
                }
                
                String val = String.valueOf(board[i][j]);
                String row = val + "ROW" + i;
                String col = val + "COL" + j;
                String box = val + "BOX" + i / 3 + "_" + j/3;
                if(!set.add(row) || !set.add(col) || !set.add(box)){
                    return false;
                }
                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
        
       return true; 
    }
}
