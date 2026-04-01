class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                String val = String.valueOf(board[i][j]);
                String strRow = val + "_ROW_" + i;
                String strCol = val + "_COL_" + j;
                String strBox = val + "_BOX_" + i/3 + "_" + j/3;
                if(set.contains(strRow) || set.contains(strCol) || set.contains(strBox)){
                    return false;
                }
                set.add(strRow);
                set.add(strCol);
                set.add(strBox);

            }
        }
        return true;
    }
}
