class Solution {
    public void solve(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            if (board[r][0] == 'O') {
                capture(board, r, 0);
            }
            if (board[r][board[0].length - 1] == 'O') {
                capture(board, r , board[0].length - 1);
            } 
        }

        for (int c = 0; c < board[0].length; c++) {
            if (board[0][c] == 'O') {
                capture(board, 0, c);
            }
            if (board[board.length - 1][c] == 'O') {
                capture(board, board.length - 1, c);
            }
        }

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == 'O') {
                    board[r][c] = 'X';
                } else if (board[r][c] == 'T') {
                    board[r][c] = 'O'; 
                }
            }
        }
        
    }

    public void capture(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') {
            return; 
        }
        board[i][j] = 'T';
        capture(board, i + 1, j);
        capture(board, i - 1, j); 
        capture(board, i, j + 1);
        capture(board, i, j - 1); 
    }
}
