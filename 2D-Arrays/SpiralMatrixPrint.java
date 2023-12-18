/*
 *     @ Spiral Matrix
 *     array[][] = { {1,2,3,4},
 *                   {5,6,7,8},
 *                   {9,10,11,12},
 *                   {13,14,15,16} };
 *     
 * Output: -> 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */

public class SpiralMatrixPrint {
    public static void spiralMatrixPrint(int matrix[][]){
        int startRow =0;
        int startCol =0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        
        while (startRow<endRow && startCol<endCol) {
            //top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i]+ " ");
            }
            //right
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]+ " ");
            }
            //bottom
            for (int i = endRow; i >=startCol ; i--) {
                System.out.print(matrix[i][endRow]+ " ");
            }
            //left
            for (int i = startCol; i >=startRow ; i--) {
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args){
        int matrix[][]= { {1,2,3,4},
          {5,6,7,8},{9,10,11,12},{13,14,15,16} };
          spiralMatrixPrint(matrix);
    }
    
}
