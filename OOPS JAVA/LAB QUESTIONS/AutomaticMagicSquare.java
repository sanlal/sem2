//Automatic generation of numbers  for Magic Square Matrix
import java.util.Scanner;

public class AutomaticMagicSquare {

    public static int[][] generateMagicSquare(int n) {
        // Initialize a two-dimensional array to store the magic square
        int[][] magicSquare = new int[n][n];
    
        // Set the starting position for the first number
        int row = n-1, col = n/2;
        
        // Loop through all the numbers from 1 to n*n
        for (int i = 1; i <= n*n; i++) {
            // Place the current number at the current position
            magicSquare[row][col] = i;
            
            // Calculate the next row and column
            int nextRow = (row + 1) % n;
            int nextCol = (col + 1) % n;
            
            // If the next position is already occupied, move one row up (towards the first row)
            if (magicSquare[nextRow][nextCol] != 0) {
                row = (row - 1 + n) % n;
            // Otherwise, move to the next position
            } else {
                row = nextRow;
                col = nextCol;
            }
        }
    
        // Return the magic square matrix
        return magicSquare;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the dimension of the magic square matrix:");
        int n = sc.nextInt();
        
        int[][] magicSquare = generateMagicSquare(n);
        
        System.out.println("The generated magic square matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}
