public class MatrisTrasposunuBulma {
    static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
        };

        int row = matrix.length, col = matrix[0].length;

        int[][] transpoze = new int[col][row];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpoze[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris :");
        print(matrix);

        System.out.println("Transpoze :");
        print(transpoze);

    }
}
