/*
 *                            Program: 19
 *   Write a java program to multiply two matrix using multi-dimensional arrays.
 */
public class Q19_multiply_two_matrix {
    public static int[][] multiply(int matrix1[][],int matrix2[][]){
        int result[][] = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i <matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for(int k=0; k<matrix1.length; k++){
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int matrix1[][]={{2,2,2},{3,3,3},{4,4,4}};
        int matrix2[][]={{2,2,2},{3,3,3},{4,4,4}};
        int result[][]=multiply(matrix1, matrix2);
        System.out.println("Multiply two matrix...!");
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
Multiply two matrix...!
18      18      18
27      27      27
36      36      36

 */
