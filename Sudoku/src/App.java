public class App {

    public static boolean isSafe(char[][] board, int row, int col, int num) {

        for(int j=0; j<9; j++) {
            if(board[row][j] == (char)(num+'0')) 
                return false;
        }

        for(int j=0; j<9; j++) {
            if(board[j][col] == (char)(num+'0')) 
                return false;
        }

        int sr = 3 * row/3;
        int sc = 3 * col/3;

        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3; j++) {
                if(board[i][j] == (char)(num+'0'))
                    return false;
            }
        }

        return true;
    }
    
    public static boolean Helper(char[][] board, int row, int col) {
        
        if(row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;

        if(col == board.length) {
            nrow++;
            ncol = 0;
        } else {
            nrow = row;
            ncol++;
        }

        if(board[nrow][ncol] != '.') {
            if(Helper(board, nrow, ncol)) {
                return true;
            }
        } else {
            for(int i=0; i<9; i++) {
                if(isSafe(board, row, col, i)) {
                    board[nrow][ncol] = (char)(i+'0');
                    if(Helper(board, nrow, ncol)) 
                        return true;
                    else 
                        board[nrow][ncol] = '.';
                } 
            }
        }

        return false;
    
    }
    public static void main(String[] args) throws Exception {
        
    }
}
