/*
 *                            @Program: 18
 *    Write a java program to add two matrix using multi-dimensional arrays.
 */
public class Q18_add_two_matrix {
    public static int[][] addMatrix(int matrix1[][], int matrix2[][]){
        int result[][] = new int[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int matrix1[][]={{2,2,2},{3,3,3},{4,4,4}};
        int matrix2[][]={{2,2,2},{3,3,3},{4,4,4}};
        int result[][]=addMatrix(matrix1, matrix2);
        System.out.println("Add two matrix...!");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

/*

Output:
Add two matrix...!
4       4       4
6       6       6
8       8       8

 */