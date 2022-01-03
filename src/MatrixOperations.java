public class MatrixOperations {

    public static void main(String[] args) {

        int[][] matrix1   = new int[4][4];  // FIRST MATRIX
        int[][] matrix2   = new int[4][4];  // SECOND MATRIX
        int[][] matrixSum = new int[4][4];  // SUMMATION
        int[][] matrixSub = new int[4][4];  // SUBTRACTION
        int[][] matrixMul = new int[4][4];  // MULTIPLICATION


        /////// FIRST MATRIX ///////

        System.out.println("First Matrix:");

        for (int i=0; i<4; i++) {
            System.out.print("[");
            for (int j=0; j<4; j++) {
                matrix1[i][j] = (int) (Math.random()*30+1);
                System.out.printf("%6d", matrix1[i][j]);
            }
            System.out.print("]");
            System.out.println();
        } System.out.println("******************************************");





        /////// TRANSPOSE OF FIRST MATRIX ///////

        System.out.println("Transpose of First Matrix:");

        for (int i=0; i<4; i++) {
            System.out.print("[");
            for (int j=0; j < 4; j++) {
                System.out.printf("%6d", matrix1[j][i]);
            }
            System.out.print("]");
            System.out.println();
        } System.out.println("******************************************");





        /////// SECOND MATRIX ///////

        System.out.println("Second Matrix:");

        for (int i=0; i< matrix2.length; i++) {
            System.out.print("[");
            for (int j=0; j< matrix2[i].length; j++) {
                matrix2[i][j] = (int) (Math.random()*30+1);
                System.out.printf("%6d", matrix2[i][j]);
            }
            System.out.print("]");
            System.out.println();
        } System.out.println("******************************************");





        /////// TRANSPOSE OF SECOND MATRIX ///////

        System.out.println("Transpose of Second Matrix:");

        for (int i=0; i<4; i++) {
            System.out.print("[");
            for (int j=0; j<4; j++) {
                System.out.printf("%6d", matrix2[j][i]);
            }
            System.out.print("]");
            System.out.println();
        } System.out.println("******************************************");





        /////// SUMMATION ///////

        System.out.println("Summation:");

        for (int i=0; i<4; i++) {
            System.out.print("[");
            for (int j=0; j<4; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.printf("%6d", matrixSum[i][j]);
            }
            System.out.print("]");
            System.out.println();
        } System.out.println("******************************************");





        /////// SUBTRACTION ///////

        System.out.println("Subtraction:");

        for (int i=0; i<4; i++) {
            System.out.print("[");
            for (int j=0; j<4; j++) {
                matrixSub[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.printf("%6d",matrixSub[i][j]);
            }
            System.out.print("]");
            System.out.println();
        } System.out.println("******************************************");





        /////// MULTIPLICATION ///////

        System.out.println("Multiplication:");

        for (int i=0; i<4; i++) {
            System.out.print("[");
            for (int j=0; j<4; j++) {
                for (int k=0; k<4; k++) {
                    matrixMul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.printf("%6d", matrixMul[i][j]);
                matrixMul[i][j] = 0;
            }
            System.out.print("]");
            System.out.println();
        } System.out.println("******************************************");



    }
}
