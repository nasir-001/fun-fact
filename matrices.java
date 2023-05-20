public class MatrixPrinter {
    public static void main(String[] args) {
        int[] matrix = {20, 13, 6, 61, 45, 70, 3, 5, 9};

        // Assuming the matrix is a 3x3 matrix
        int rows = 3;
        int columns = 3;

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[index] + " ");
                index++;
            }
            System.out.println();
        }
    }
}