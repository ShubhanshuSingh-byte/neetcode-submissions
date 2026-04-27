class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;

        while(i<matrix.length)
        {
            if(target>=matrix[i][0] && target<=matrix[i][matrix[i].length-1]){
                break;
            }
            i++;
        }

        if(i==matrix.length) return false;

        int l = 0;
        int h = matrix[i].length - 1;
        int m=0;

        while (l <= h) {
            m = l + (h - l) / 2;

            if (matrix[i][m] == target) {
                break;
            } else if (target > matrix[i][m]) {
                l = m + 1;
            } else {
                h = m - 1;  
            }
        }

        return matrix[i][m]==target ? true : false;
    }
}
