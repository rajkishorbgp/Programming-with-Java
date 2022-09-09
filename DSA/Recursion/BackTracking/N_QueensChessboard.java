/*              
 *                          N-Queens
 *      Place N queen on an N*N chessboard such that no 2 queens can attack each other
 *        
 *      N-Queens - count ways
 *     Count total number of ways in which we can solve N Queens problem.
 */

public class N_QueensChessboard {

    public static boolean isSafe(char board[][], int row, int col) {
        
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diag left up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        
        //diag right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++ ){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }

    public static void printChessboard(char arr[][]){
        System.out.println("---chessboard---");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }

    public static void nQueens(char board[][], int row){
        // base
        if(row==board.length){
            count++;
            printChessboard(board);
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board, row+1);  //function call
                board[row][j]='X';     //backtracking step
            }
        }
    }

    static int count=0;
    
    public static void main(String[] args) {
        int n=4;
        char chessboard[][]=new char[n][n];
        // initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                chessboard[i][j]='X';
            }
        }
        nQueens(chessboard,0);
        System.out.println("Total ways to solve n queens = "+ count);
    }
}

/*
 *    Output:
 *    ---chessboard---
 *    X Q X X 
 *    X X X Q 
 *    Q X X X 
 *    X X Q X 
 *    ---chessboard---
 *    X X Q X 
 *    Q X X X 
 *    X X X Q 
 *    X Q X X 
 */
