import java.util.Scanner;

public class MagicSquare {

  static int[][] magicSquare(int n) {
    int[][] magic = new int[n][n];
    int row = 0, col = n / 2, num = 1;
    while (num <= n * n) {
      magic[row][col] = num++;
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
