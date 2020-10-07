public class NiscInterviewRound2 {

    public static void CheckBoard(char[][] board){
        int xs = 0;
        int os = 0;

//        int xwins = 0;
//        int owins = 0;
        if(isValidBoard(board, xs, os)){
            boolean Xwin = isWinningBoard(board, 'x');
            if(Xwin){
                System.out.println("X is a winner");
            }else{
                boolean Owin = isWinningBoard(board, 'o');
                if(Owin){
                    System.out.println("O is a winner");
                }
                else{
                    System.out.println("No Winning Condition");
                }
            }
        }
        else{
            System.out.println("Not a Valid Board");
        }
    }

    public static boolean isValidBoard(char[][] board, int xCount, int oCount){
        //Assume ' ' is no move yet, 'x' , or 'o'
        //Check for any other character or non character

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                //Maybe check for non characters
                if(board[i][j] != 'x' && board[i][j] != 'o' && board[i][j] != ' '){
                    return false;
                }//Todo - Refactor plz
                else if(board[i][j] == 'x'){
                    xCount++;
                }else if(board[i][j] == 'o') {
                    oCount++;
                }
            }

        }
        if(xCount == oCount || xCount == oCount + 1){
            return true;
        }
        return false;
    }

    public static boolean isWinningBoard(char[][] board, char turn){
        for (int i = 0; i < board.length ; i++) {
            if(CheckHorizontal(board, i, turn)){
                return true;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if(CheckVertical(board, i, turn)){
                return true;
            }
        }
        if(CheckLeftDiagonal(board, turn)){
            return true;
        }

        if(CheckRightDiagonal(board, turn)){
            return true;
        }
        return false;
    }

    public static boolean CheckHorizontal(char[][] board, int row, char turn){

        for (int i = 0; i < board.length; i++) {
            if(board[row][i] != turn){
                return false;
            }
        }
        return true;
    }

    public static boolean CheckVertical(char[][] board, int col, char turn){

        for (int i = 0; i < board.length; i++) {
            if(board[i][col] != turn){
                return false;
            }
        }
        return true;
    }

    public static boolean CheckLeftDiagonal(char[][] board, char turn){
        for (int i = 0; i < board.length; i++) {
            if(board[i][i] != turn){
                return false;
            }
        }
        return true;
    }

    public static boolean CheckRightDiagonal(char[][] board, char turn){
        int j = board.length - 1;
        for (int i = 0; i < board.length; i++) {
            if(board[i][j] != turn){
                return false;
            }
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        char[][] tictactoeboard = {{'x', 'x', 'x'}, {' ', ' ', ' '}, {'o', 'o', 'o'}};
        char[][] tictactoeboard2 = {{'x', 'x', 'x'}, {'x', 'x', 'x'}, {'x', 'x', 'x'}};
        CheckBoard(tictactoeboard);
    }
}
