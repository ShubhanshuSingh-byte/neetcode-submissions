class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (bt(i, j, 0, board, word, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean bt(int row, int col, int index, char[][] board, String word, boolean[][] visited){
        if(index==word.length()){
            return true;
        }
        if(row < 0|| col<0|| row>=board.length|| col>=board[0].length|| visited[row][col]==true||board[row][col]!=word.charAt(index)){
            return false;
        }
        visited[row][col]=true;
        boolean res = bt(row, col+1, index+1, board, word, visited)||bt(row+1, col, index+1, board, word, visited)||bt(row-1, col, index+1, board, word, visited)||bt(row, col-1, index+1, board, word, visited);
        visited[row][col]=false;
        return res;
    }
}
