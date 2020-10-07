package ModerateProblems;

public class TicTacWin16_4 {

    public static boolean TicTacToeWinner(char[][] board, char move, int row, int col){
        //Check for Horizontal
        if(HorizontalWin(board, row, move)){
            return true;
        }
        //Check for Vertical
        if(VerticalWin(board, col, move)){
            return true;
        }
        //Check for Diagonal
        if(DiagonalWin(board, move, row, col)){
            return true;
        }
        return false;
    }

    public static boolean HorizontalWin(char[][] board, int row, char move){
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] != move){
                System.out.println(row + "," + i + "false");
                return false;
            }
        }
        System.out.println("Horizontal Win");
        return true;
    }

    public static boolean VerticalWin(char[][] board, int col, char move) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] != move) {
                System.out.println(i + "," + col + "false");
                return false;
            }
        }
        System.out.println("Vertical Win");
        return true;
    }

    public static boolean DiagonalWin(char[][] board, char move, int row, int col){
        if(row == col) {
            boolean win = true;
            for (int i = 0; i < board.length; i++) {
                if(board[i][i] != move){
                    win = false;
                    break;
                }
            }
            if(win){
                return true;
            }
        }

        int curRow = board.length;
        for (int i = 0; i < board.length; i++) {
            if(board[curRow][i] != move){
                return false;
            }
            else{
                curRow--;
            }
        }
        return true;
    }


    public static void main(String[] args) {

    }
}
