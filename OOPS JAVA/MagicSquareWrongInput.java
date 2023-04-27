import java.util.Scanner;

public class MagicSquareWrongInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] magicSquare = new int[3][3];
        
        System.out.println("Enter the numbers for the magic square matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                magicSquare[i][j] = sc.nextInt();
            }
        }
        
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
                System.out.println("Incorrect row sum in row " + (i + 1));
                System.out.println("Enter a new number for row " + (i + 1) + " column " + (j + 1) + ":");
                magicSquare[i][j] = sc.nextInt();
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
                System.out.println("Incorrect column sum in column " + (i + 1));
                System.out.println("Enter a new number for row " + (j + 1) + " column " + (i + 1) + ":");
                magicSquare[j][i] = sc.nextInt();
            }
        }
        
        // Check main diagonals
        int diag1Sum = magicSquare[0][0] + magicSquare[1][1] + magicSquare[2][2];
        int diag2Sum = magicSquare[0][2] + magicSquare[1][1] + magicSquare[2][0];
        if (diag1Sum != magicConstant) {
            isMagicSquare = false;
            System.out.println("Incorrect main diagonal sum.");
            System.out.println("Enter a new number for row 1 column 1:");
            magicSquare[0][0] = sc.nextInt();
        }
        if (diag2Sum != magicConstant) {
            isMagicSquare = false;
            System.out.println("Incorrect main diagonal sum.");
            System.out.println("Enter a new number for row 1 column 3:");
            magicSquare[0][2] = sc.nextInt();
        }
        
         // Print result
        if (isMagicSquare) {
            System.out.println("The matrix is a magic square!");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }
}