class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        long left = 0 ;
        long right = (long)m * n - 1 ;
        while(left <= right){
            long mid = left + (right - left) / 2 ;
            int row = (int) mid / n;
            int col = (int)mid % n;
            int val = matrix[row][col];
            if(val == target){
                return true;
            }
             if (val < target) {
                left = mid + 1;
             }else{
                right = mid - 1 ;
             }
          
        }
        return false;
    }


}
