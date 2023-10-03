/*
 *        N-Queens - print 1 solution
 *   Check if problem  can be solved & print only 1 solution to N Queens problem.
 */

public class N_QueensChessboardPrint_1_Solution {
    
    public static boolean isSafe(char board[][] , int row , int col){
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false; 
            }
        }
        for(int i=row-1,j=col-1; i>=0 && j>=0; i-- , j--){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if (board[i][j]=='Q') {
                return false;
            }
        }  
        return true;
    }

    public static boolean nQueens(char board[][] , int row ) {
        
        if (row==board.length) {
            return true;
        }
        
        for(int j=0; j<board.length; j++){
           
            if(isSafe(board, row,j)){
                board[row][j]='Q';
                if(nQueens(board , row+1)){
                    return true;
                }
                board[row][j]='X';
            }
        }
        return false;
    }
    public static void printChessboard(char board[][]) {
        System.out.println("----Chessboard-----");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] +" ");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        char board[][]= new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j]='X';
            }
        }
        if (nQueens( board, 0)) {
            System.out.println("Solution is possible");
            printChessboard(board);
        }else{
            System.out.println("Solution is not possible");
        }
    }
}


/*
 *    Output:
 *    Solution is possible
 *    ----Chessboard-----
 *    X Q X X 
 *    X X X Q
 *    Q X X X
 *    X X Q X
 */