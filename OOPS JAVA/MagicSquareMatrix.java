//condition 1:  2,7,6,9,5,1,4,3,8
public class MagicSquareMatrix {

    public static void main(String[] args) {
        int[][] magicSquare = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        
        int magicConstant = magicSquare[0][0] + magicSquare[1][1] + magicSquare[2][2];
        
        boolean isMagicSquare = true;
        
        // Check rows
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += magicSquare[i][j];
            }
            if (rowSum != magicConstant) {
                isMagicSquare = false;
                break;
            }
        }
        
        // Check columns
        for (int i = 0; i < 3; i++) {
            int colSum = 0;
            for (int j = 0; j < 3; j++) {
                colSum += magicSquare[j][i];
            }
            if (colSum != magicConstant) {
                isMagicSquare = false;
                break;
            }
        }
        
        // Check main diagonals
        int diag1Sum = magicSquare[0][0] + magicSquare[1][1] + magicSquare[2][2];
        int diag2Sum = magicSquare[0][2] + magicSquare[1][1] + magicSquare[2][0];
        if (diag1Sum != magicConstant || diag2Sum != magicConstant) {
            isMagicSquare = false;
        }
        
        // Print result
        if (isMagicSquare) {
            System.out.println("The matrix is a magic square!");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }
}
