import java.util.Scanner;

public class MagicSquare {

  static int[][] magicSquare(int n) {
    int[][] magic = new int[n][n];
    
    int row = 0, col = n / 2, num = 1;
    while (num <= n * n) {
      magic[row][col] = num++;public class MagicSquare {

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

      if (row == 0)
        row = n - 1;
      else
        row--;
      if (col == n - 1)
        col = 0;
      else
        col++;
    }
    return magic;
  }

  static void printSquare(int[][] magic) {
    for (int i = 0; i < magic.length; i++) {
      for (int j = 0; j < magic[i].length; j++)
        System.out.print(magic[i][j] + "\t");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of magic square: ");
    int n = in.nextInt();
    int[][] magic = magicSquare(n);
    System.out.println("The magic square of size " + n + "x" + n + " is: ");
    printSquare(magic);
    in.close();
  }
}
