import java.util.*;
public class App {

    public static boolean isSafe(int row, int col, char[][] board) {
        //Horizontal
        for(int i=0; i<board.length; i++) {
            if(board[row][i] == 'Q') {
                return false;
            }
        }

        //Vertical
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //Top left
        for(int r=row, c=col; c>=0 && r>=0; c--,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //Top right
        for(int r=row, c=col; c<board.length && r>=0; c++,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //Bottom left
        for(int r=row, c=col; c>=0 && r<board.length; c--,r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //Bottom right
        for(int r=row, c=col; c<board.length && r<board.length; c++,r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void SaveBoard(char[][] board, List<List<String>> allBoards) {
        
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col) {

        for(int row=0; row<board.length; row++) {
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';

                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
            
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();

        char[][] board = new char[n][n];

        helper(board, allBoards, 0);

        return allBoards;
    }

    public static void main(String[] args) throws Exception {
        
    }
}
