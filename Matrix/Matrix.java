public class Matrix {

    public static void main(String args[]) {

        int matrix[][] = new int[3][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        int matrix1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Matrix Creation : ");
        printMatrix(matrix, 3, 3);

        System.out.println("Matrix Addition : ");
        addMatrices(matrix, matrix1, 3, 3);

        System.out.println("Matrix Subtraction : ");
        subtractMatrices(matrix, matrix1, 3, 3);

        System.out.println("Matrix Multiplication : ");
        multiplicationMatrices(matrix, matrix1, 3, 3);

        System.out.println("Matrix Transpose : ");
        transposeMatrix(matrix, 3, 3);

        System.out.println("Matrix Rotation at 90deg : ");
        rotateMatrix(matrix, 3);

        System.out.println("Matrix Spiral : ");
        spriralTraversal(matrix, 3, 3);

    }

    //    Print Matrix
    public static void printMatrix(int matrix[][], int m, int n) {
        System.out.println("Matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //    Addition of Matrix
    public static void addMatrices(int mat1[][], int mat2[][], int m, int n) {

        int mat3[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        printMatrix(mat3, m, n);
    }

    //    Subtraction of Matrix
    public static void subtractMatrices(int mat1[][], int mat2[][], int m, int n) {

        int mat3[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat3[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        printMatrix(mat3, m, n);
    }

    //    Multiplication of Matrix
    public static void multiplicationMatrices(int mat1[][], int mat2[][], int m, int n) {

        int mat3[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    mat3[i][j] = mat1[i][k] * mat2[k][j];
                }
            }
        }
        printMatrix(mat3, m, n);
    }

    //    Transpose a Matrix
    public static void transposeMatrix(int mat1[][], int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat1[j][i];
                mat1[j][i] = mat1[i][j];
                mat1[i][j] = temp;
            }
        }
        printMatrix(mat1, m, n);
    }

    //        Rotate the Matrix at 90deg
    public static void rotateMatrix(int mat[][], int n) {
        int temp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = mat[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = temp[j][n - i - 1];
            }
        }

        printMatrix(mat, n, n);
    }


    public static void spriralTraversal(int matrix[][], int m, int n) {
        int i, k = 0, l = 0;

        while (k < m && l < n) {
            for (i = l; i < n; i++) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for (i = k; i < m; i++) {
                System.out.print(matrix[i][n - 1] + " ");
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; i--) {
                    System.out.print(matrix[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }

}



